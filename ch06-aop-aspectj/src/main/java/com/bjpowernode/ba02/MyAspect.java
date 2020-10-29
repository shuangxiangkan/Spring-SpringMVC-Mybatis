package com.bjpowernode.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {

//    @Before(value = "execution(public void com.bjpowernode.ba01.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间："+new Date());
//    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",
                    returning = "res")
    public void myAfterReturning(Object res){
        System.out.println("后置通知：在目标方法之后执行的，获取的返回值是："+res);
        if(res.equals("abcd")){

        }else{

        }
        if(res!=null){
            res="Hello Aspectj";
        }
    }
}
