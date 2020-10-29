package com.bjpowernode;

import com.bjpowernode.service.HelloService;
import com.bjpowernode.service.impl.HelloServiceImpl;
import com.bjpowernode.service.impl.HelloServiceImpl2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        HelloService service=new HelloServiceImpl();
//        service.sayHello("张三");

        //使用反射机制执行sayhello方法，核心Method(类中的方法)
        HelloService target=new HelloServiceImpl();
        //获取sayHello名称对于的Method类对象
        Method method=HelloService.class.getMethod("sayHello", String.class);
        //通过Method可以执行sayHello方法调用
        /*
        invoke是Method类中的一个方法，表示方法的调用
        参数：
        1.Object, 表示对象的，要执行这个对象的方法
        2.Object... args,方法执行时的参数值
        返回值：
        Object:方法执行后的返回值
         */
        //表示的意思就是，执行target对象sayHello，参数是李四
        HelloService service2=new HelloServiceImpl2();
        Object ret=method.invoke(service2,"李四");


    }
}
