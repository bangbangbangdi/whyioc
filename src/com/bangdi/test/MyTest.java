package com.bangdi.test;

import com.bangdi.dao.impl.UserDaoImpl;
import com.bangdi.dao.impl.UserDaoMysqlImpl;
import com.bangdi.dao.impl.UserDaoOracleImpl;
import com.bangdi.service.UserService;
import com.bangdi.service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserDaoMysqlImpl userDaoMysql = new UserDaoMysqlImpl();
        UserDaoOracleImpl userDaoOracle = new UserDaoOracleImpl();
        userService.setUserDao(userDaoMysql);
        userService.getUser();
        System.out.println("----------------------------");
        userService.setUserDao(userDaoOracle);
        userService.getUser();
    }
}
