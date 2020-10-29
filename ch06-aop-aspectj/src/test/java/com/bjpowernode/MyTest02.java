package com.bjpowernode;

import com.bjpowernode.ba02.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        SomeService proxy= (SomeService) ctx.getBean("someService");
        String str = proxy.doOther("zs", 28);
        System.out.println("str==="+str);

    }
}
