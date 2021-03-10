package com.shop.dao.impl;

import com.shop.bean.User;
import com.shop.dao.BaseDao;
import com.shop.dao.UserDao;

public class UserDaoImp extends BaseDao implements UserDao {
    @Override
    public User querUserByUserName(String username) {
        String sql = "SELECT 'id','username','password',email FROM user WHERE 'username' = ?";
        return super.queryForOne(User.class , sql ,username);
    }

    @Override
    public int addUser(User user) {
        String sql = "INSERT INTO user(username,password,email) VALUES(?,?,?)";
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        return super.update(sql,username,password,email);

    }
}
