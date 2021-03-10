package com.shop.service;

import com.shop.bean.User;
import com.shop.dao.impl.UserDaoImp;

public class RegistServer {
    public boolean regist(User user){
        UserDaoImp u =new UserDaoImp();
        int i = u.addUser(user);
        if (i==1){
            return true;
        }else {
            return false;
        }
    }
}
