package com.bangdi.dao.impl;

import com.bangdi.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从Oracle中获取数据");
    }
}
