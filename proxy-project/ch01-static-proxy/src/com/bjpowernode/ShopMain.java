package com.bjpowernode;

import com.bjpowernode.shangjia.TaoBao;
public class ShopMain {
    public static void main(String[] args) {
        //创建代理的商检taobao对象
        TaoBao taoBao=new TaoBao();
        float price=taoBao.sell(1);
        System.out.println("通过淘宝的商家，购买U盘单价："+price);
    }
}
