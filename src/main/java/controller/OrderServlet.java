package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.OrderDAO;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            // Get session
            HttpSession session = request.getSession();

            // Example: user stored during login
            int userId = (int) session.getAttribute("userId");

            // Get payment method from cart.jsp
            String paymentMethod = request.getParameter("payment");

            // Example total amount
            double totalAmount = Double.parseDouble(request.getParameter("totalAmount"));

            // DAO call
            OrderDAO orderDAO = new OrderDAO();
            orderDAO.placeOrder(userId, totalAmount, paymentMethod);

            // Redirect to orders page
            response.sendRedirect("student/orders.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}