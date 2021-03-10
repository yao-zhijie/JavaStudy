package com.demo02.test02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/Test03.do")
public class Test02  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求重定向的两种方法
        //方法一 访问外网
        //设置访问状态码表示重定向（原网址已搬迁）
        resp.setStatus(302);
        //重定向至外网
        resp.setHeader("location","http://www.baidu.com");
        //方法二 访问项目内
        //resp.sendRedirect("http://location:8080/Damo0308/Test01.html");
    }
}
