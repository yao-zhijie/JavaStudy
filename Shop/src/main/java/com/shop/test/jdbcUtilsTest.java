package com.shop.test;

import com.shop.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
public class jdbcUtilsTest {
    @Test
    public void testJdbcUtils(){
        for (int i = 0; i <100 ; i++) {
            Connection con = JdbcUtils.getConnection();
            System.out.println(con);
            JdbcUtils.close(con);
        }
    }
}
