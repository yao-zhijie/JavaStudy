package com.shop.dao;

import com.shop.bean.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param UserName
     * @return 如果返回null 说明没有这个用户
     */
    public User querUserByUserName(String UserName);
    public int addUser(User user);

}
