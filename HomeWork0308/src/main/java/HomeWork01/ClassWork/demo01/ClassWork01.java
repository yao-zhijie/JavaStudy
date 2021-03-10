package HomeWork01.ClassWork.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "ClassWork01" ,urlPatterns = "/ClassWork01")
public class ClassWork01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的资源路径
        System.out.println("uri"+req.getRequestURI());
        //获取请求的统一资源定位
        System.out.println("URL"+req.getRequestURL());
        //获取客户端IP地址
        System.out.println("客户端的主机地址"+req.getRemoteHost());
        System.out.println("客户端的getRemoteAddr"+req.getRemoteAddr());
        //获取请求头
        System.out.println("请求头"+req.getHeader("Cookie"));
        //获取请求方式
        System.out.println("请求方式"+req.getMethod());

    }
}
