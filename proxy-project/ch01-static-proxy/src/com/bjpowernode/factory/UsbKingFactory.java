package com.bjpowernode.factory;

import com.bjpowernode.service.UsbSell;

import javax.crypto.spec.PSource;


//目标类：金士顿厂家，不接受用户的单独购买
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        System.out.println("目标类的方法调用，UsbKingFactory中的sell");
        //一个128G的u盘是85元
        //后期根据amount,可以实现不同的价格，例如10000个，单价是80,50000个是75
        return 85.0f;
    }
}
