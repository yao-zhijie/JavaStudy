package com.demo01.test;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/Test01")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的资源路径
        System.out.println("URI"+req.getRequestURI());
        //获取请求的统一资源定位
        System.out.println("URL"+req.getRequestURL());
        //获取客户端的IP地址
        System.out.println("客户端的IP地址"+req.getRemoteHost());
        System.out.println("客户端的getRemoteAddr"+req.getRemoteAddr());
        //获取请求头
        System.out.println("请求头"+req.getHeader("Cookie"));
        //获取请求方式
        System.out.println("请求方式为"+req.getMethod());
        //获取表单内信息
        //获取请求参数
        String userName = req.getParameter("userName");
        String password = req.getParameter("passWord");
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println("用户名"+userName);
        System.out.println("密码"+password);
        System.out.println("爱好"+ Arrays.asList(hobbies));
        req.setAttribute("key1","Test01");
        //请求转发
        //固定写法
        req.getRequestDispatcher("/Test02").forward(req,resp);

    }
}
