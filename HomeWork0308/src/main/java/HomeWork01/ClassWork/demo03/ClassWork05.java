package HomeWork01.ClassWork.demo03;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "ChangeImg",urlPatterns = "/verifyCode.do")
public class ClassWork05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1.使用BufferedImage创建图片
         * 2。Graphics 画笔绘制内容
         * 绘制显示区域
         * 绘制随机字符
         * 绘制干扰线
         * 3。绘制ImageIO将BufferedImage写入浏览器
         * 必须使用response.getOutputStream
         * */
        //绘制的验证码的高和宽
        int height= 30;
        int weight =80;
        //验证码的随机内容
        String data = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //创建随机数
        Random r = new Random();
        //创建图片
        BufferedImage img = new BufferedImage(weight,height,BufferedImage.TYPE_INT_RGB);
        //3. 获得画笔
        Graphics graphics = img.getGraphics();
        //4画一个矩形
        //给画笔设置颜色
        graphics.setColor(Color.BLACK);
        //绘制外边款
        graphics.fillRect(0,0,weight,height);
        graphics.setColor(Color.WHITE);
        //绘制内边框
        graphics.fillRect(1,1,weight-2,height-2);
        graphics.setFont(new Font("宋体",Font.BOLD|Font.ITALIC,25));
        //写随机数字
        for (int i = 0; i <4 ; i++) {
            graphics.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
            //获得随机字
            int index = r.nextInt(data.length());
            String str = data.substring(index, index + 1);
            //写入
            graphics.drawString(str, weight / 6 * (i + 1), 20);


        }
        for (int i = 0; i < 3; i++) {
            //设置颜色
            graphics.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
            //绘制随机线
            graphics.drawLine(r.nextInt(weight), r.nextInt(height), r.nextInt(weight), r.nextInt(height));
            //随机点
            graphics.drawOval(r.nextInt(weight), r.nextInt(height), 2, 2);
        }
        //将图片响应给浏览器
        ImageIO.write(img,"jsp",resp.getOutputStream());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
