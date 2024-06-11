package fr.esiea.controllers;
import fr.esiea.models.User;
import fr.esiea.services.UserService;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/addUser")
public class UserController extends HttpServlet {
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        try{
            userService.addUser(user);

            response.sendRedirect("index.jsp");
        }catch (SQLException e) {
            throw new ServletException("Error", e);
        }
    }
}
