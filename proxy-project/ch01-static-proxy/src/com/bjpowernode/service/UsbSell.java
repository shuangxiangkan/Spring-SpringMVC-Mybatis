package com.bjpowernode.service;


//表示功能的厂家，商家都要完成的功能
public interface UsbSell {

    //定义方法 参数 amount:表示一次购买的数量，暂时不用
    //返回值表示一个u盘的价格
    float sell(int amount);


    //可以多个其他的方法
}
