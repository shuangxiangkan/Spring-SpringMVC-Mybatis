package com.bjpowernode.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//必须实现InvocationHandler接口，完成代理类要做的功能（1.调用目标功能，2.方法增强）
public class MySellHandler implements InvocationHandler {


    private Object target=null;

    //动态代理：目标对象是活动的，不是固定的，需要传入进来
    //传入是谁，就给谁创建代理


    public MySellHandler(Object target) {
        //给目标对象赋值
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res=null;
        //向厂家发送订单，告诉厂家，我买了U盘，厂家发货
        //float price=factory.sell(amount);
        res=method.invoke(target,args);//执行目标方法

        //商家需要加价，也就是代理要增加价格
        //price=price+25;

        if(res!=null){
            Float price=(Float)res;
            price=price+25;
            res=price;
        }

        System.out.println("淘宝商家，给你返一个优惠券或者红包");
        //增加的价格
        return res;
    }
}
