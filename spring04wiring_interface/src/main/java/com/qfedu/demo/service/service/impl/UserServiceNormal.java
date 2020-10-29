package com.qfedu.demo.service.service.impl;

import com.qfedu.demo.service.UserService;
import com.qfedu.demo.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceNormal implements UserService {

    @Autowired
    private UserDao userDao;
    public void add() {
        System.out.println("添加用户");
    }
}
