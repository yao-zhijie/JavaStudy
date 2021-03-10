package com.shop.servlet;

import com.shop.bean.User;
import com.shop.service.LoginChecking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet" ,urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User(username,password);
        LoginChecking loginChecking =new LoginChecking();
        boolean flag = loginChecking.loginCheck(user);
        if (flag){
            req.getRequestDispatcher("/login_success.html").forward(req,resp);
        }else {
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = resp.getWriter();
            writer.print("<html><body><script type='text/javascript'>alert('账户密码错误！');</script></body></html>");
            writer.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
