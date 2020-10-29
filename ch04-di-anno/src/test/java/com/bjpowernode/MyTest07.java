package com.bjpowernode;

import com.bjpowernode.ba07.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);

        Student Student = (Student) ctx.getBean("myStudent");

        System.out.println("student="+Student);
    }
}
