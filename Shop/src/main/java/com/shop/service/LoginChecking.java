package com.shop.service;

import com.shop.bean.User;

import com.shop.dao.impl.UserDaoImp;

public class LoginChecking {
    public  boolean loginCheck(User user){
        UserDaoImp u =new UserDaoImp();
        User user1 = u.querUserByUserName(user.getUsername());
        if (user1 == null){
            return false;
        }
        if (user.getPassword().equals(user1.getPassword())){
            return true;
        }else {
            return false;
        }
    }
}
