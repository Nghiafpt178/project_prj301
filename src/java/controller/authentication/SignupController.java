/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.authentication;

import dal.AccountDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class SignupController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repass = request.getParameter("repass");
        AccountDBContext accountDB = new AccountDBContext();
        Account a = accountDB.checkAccountExist(username);
        if (!password.equals(repass) || a != null) {
            request.setAttribute("error", "Tài khoản đã tồn tại/Mật khẩu không trùng khớp");
            request.getRequestDispatcher("login").forward(request, response);
        } else {
            accountDB.inserAccount(username, password);
            request.setAttribute("success", "Đăng kí thành công");
            request.getRequestDispatcher("login").forward(request, response);

        }
    }

}
