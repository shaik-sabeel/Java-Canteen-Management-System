package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DBConnection;

public class CartDAO {

    public void addToCart(int userId, int foodId, int quantity) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO cart(user_id, food_id, quantity) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, userId);
            ps.setInt(2, foodId);
            ps.setInt(3, quantity);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}