package com.demo.test01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@javax.servlet.annotation.WebServlet(name = "Demo01Servlet" ,urlPatterns = "/demo01")
public class Demo01Servlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    //通过response 获取字符输出流
        PrintWriter writer = response.getWriter();
    //防止响应乱码
     //   response.setContentType("text/html ;charset=UTF-8");
    //每行输出页面
        writer.write("<!DOCTYPE html>");
        writer.write("<head>");
        writer.write("  <meta charset=UTF-8>");
        writer.write(" <title>JspTest</title>");
        writer.write(" </head>");
        writer.write(" <body>");
        writer.write("<h1>现在的时间是："+new Date()+"</h1>");
        writer.write("</body>" );
        writer.write("</html>" );
    }
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
doPost(request,response);
    }
}
