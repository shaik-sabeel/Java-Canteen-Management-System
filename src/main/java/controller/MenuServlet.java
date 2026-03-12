package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Later you will fetch menu items from DB here

        RequestDispatcher dispatcher =
                request.getRequestDispatcher("student/menu.jsp");

        dispatcher.forward(request, response);
    }
}