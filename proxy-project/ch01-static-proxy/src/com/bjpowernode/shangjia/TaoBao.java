package com.bjpowernode.shangjia;

import com.bjpowernode.factory.UsbKingFactory;
import com.bjpowernode.service.UsbSell;

//taobao是一个商家，代理金士顿U盘的销售
public class TaoBao implements UsbSell {

    //声明 商家代理的厂家具体是谁
    private UsbKingFactory factory=new UsbKingFactory();
    @Override
    //实现销售U盘功能
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家，我买了U盘，厂家发货
        float price=factory.sell(amount);
        //商家需要加价，也就是代理要增加价格
        price=price+25;
        System.out.println("淘宝商家，给你返一个优惠券或者红包");
        //增加的价格
        return price;
    }
}
