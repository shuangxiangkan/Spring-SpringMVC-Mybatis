package com.qfedu.demo.service.dao.impl;

import com.qfedu.demo.service.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoNormal implements UserDao {
    public void add() {
        System.out.println("添加用户到数据库中......");
    }
}
