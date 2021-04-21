package com.bangdi.dao.impl;

import com.bangdi.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从MySQL获取数据");
    }
}
