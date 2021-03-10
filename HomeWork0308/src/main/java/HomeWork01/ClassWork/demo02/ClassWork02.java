package HomeWork01.ClassWork.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
@WebServlet("/Test01")
public class ClassWork02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取表单内信息
        //获取请求参数
        String userName = req.getParameter("userName");
        String password = req.getParameter("passWord");
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println("用户名"+userName);
        System.out.println("密码"+password);
        System.out.println("爱好"+ Arrays.asList(hobbies));
        //请求转发
        //先转发传值
        req.setAttribute("key1","Test01");
        //固定写法
        req.getRequestDispatcher("/ClassWork03").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
