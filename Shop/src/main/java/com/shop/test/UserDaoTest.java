package com.shop.test;

import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImp;
import org.junit.Test;

public class UserDaoTest {
    UserDao userDao = new UserDaoImp();
    @Test
    public void querUserByUsername(){
        System.out.println(userDao.querUserByUserName("admin"));
    }
    @Test
    public void adduser(){
        User user = new User("11111","222222","333333");
        System.out.println(userDao.addUser(user));
    }
}
