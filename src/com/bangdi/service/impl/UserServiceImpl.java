package com.bangdi.service.impl;

import com.bangdi.dao.UserDao;
import com.bangdi.dao.impl.UserDaoImpl;
import com.bangdi.dao.impl.UserDaoMysqlImpl;
import com.bangdi.service.UserService;

public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
