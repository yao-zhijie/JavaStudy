package com.shop.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    //阿里巴巴德鲁伊数据库连接数据源
    private static DruidDataSource dataSource;

    static {

        try {
            //读取jdbc.properties属性配置文件
            Properties properties = new Properties();
            //获取配资文件的输入流
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //从流中加载数据
            properties.load(inputStream);
            //创建数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }
    }

    /*
     * 获取数据库连接池中的连接
     * @return 如果返回 null 说明获取连接失败 有值就是获取连接成功
     * */
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = dataSource.getConnection();
        } catch (SQLException throwables) {

        }
        return con;
    }

    /*
     * 关闭连接 放回数据库连接池
     * */
    public static void close(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
