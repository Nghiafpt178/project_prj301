/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.authentication;

import dal.AccountDBContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/view/authen/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        AccountDBContext accountDB = new AccountDBContext();
        Account account = accountDB.getAccount(username, pass);
        if (account != null) //login successful
        {
            request.setAttribute("user", username);
            request.getSession().setAttribute("account", account);
            request.getRequestDispatcher("../view/home/home.jsp").forward(request, response);

        } else {
            request.setAttribute("errorMess", "Wrong username or password!");
            request.getSession().setAttribute("account", null);
            request.getRequestDispatcher("/view/authen/login.jsp").forward(request, response);

        }
    }

}
