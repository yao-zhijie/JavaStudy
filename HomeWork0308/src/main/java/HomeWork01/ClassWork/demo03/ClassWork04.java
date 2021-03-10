package HomeWork01.ClassWork.demo03;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class ClassWork04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //实现文件下载， 获取响应对象的字节输出流
        OutputStream outputStream = resp.getOutputStream();
        //用来表示服务端需要传输给浏览器端的文件
        File file = new File("/Users/yaozhijie/Java学习资料/笔记/一阶段笔记/1.jpg");
        //通过响应 设置响应头 告诉浏览器需要下载文件
        resp.setHeader("content-disposition","attachment;fileName="+"abc.jpg");
        //获取字节输入流读取要下载文件 并输出
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes);
            outputStream.flush();
        }
        inputStream.close();
        outputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
