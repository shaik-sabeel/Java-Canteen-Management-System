package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.FoodItem;
import util.DBConnection;

public class FoodDAO {

    public List<FoodItem> getAllFoodItems() {

        List<FoodItem> foodList = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM food_items";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                FoodItem food = new FoodItem();

                food.setId(rs.getInt("food_id"));
                food.setName(rs.getString("food_name"));
                food.setPrice(rs.getDouble("price"));
                food.setQuantity(rs.getInt("quantity"));

                foodList.add(food);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return foodList;
    }
}