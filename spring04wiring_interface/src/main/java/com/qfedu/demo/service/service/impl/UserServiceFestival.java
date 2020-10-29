package com.qfedu.demo.service.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("festival")
public class UserServiceFestival implements UserService {

    public void add() {
        System.out.println("注册用户发送优惠券");
    }
}
