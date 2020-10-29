package com.qfedu.demo.config;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.dao.impl.UserDaoNoraml;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserDao userDaoNormal(){
        System.out.println("创建UserDao对象");
        return new UserDaoNoraml();
    }
}
