package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();

        // Demo logic (replace with DB validation)
        if(email.equals("admin@college.com") && password.equals("admin")){

            session.setAttribute("role", "admin");
            session.setAttribute("userEmail", email);

            response.sendRedirect("admin/dashboard.jsp");

        } else {

            session.setAttribute("role", "student");
            session.setAttribute("userEmail", email);

            response.sendRedirect("student/home.jsp");
        }
    }
}