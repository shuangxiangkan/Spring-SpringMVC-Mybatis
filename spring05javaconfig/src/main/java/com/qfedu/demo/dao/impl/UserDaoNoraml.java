package com.qfedu.demo.dao.impl;

import com.qfedu.demo.dao.UserDao;
import org.springframework.stereotype.Component;


public class UserDaoNoraml implements UserDao {
    public void add() {
        System.out.println("添加用户到数据库中.....");
    }
}
