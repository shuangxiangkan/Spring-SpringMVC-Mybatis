package com.bjpowernode.service.impl;

import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.domain.Goods;
import com.bjpowernode.domain.Sale;
import com.bjpowernode.excep.NotEnoughException;
import com.bjpowernode.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {

    private SaleDao saleDao;
    private GoodsDao goodsDao;



    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("========buy方法的开始=========");
        //记录销售信息，想Sale表添加数据
        Sale sale=new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        //更新库存
        Goods goods=goodsDao.selectGoods(goodsId);
        if(goods==null){
            throw new NullPointerException("编号是:"+goodsId+",商品不存在");
        }else if(goods.getAmount()<nums){
            //商品库存不足
            throw new NotEnoughException("编号是:"+goodsId+",商品库存不足");
        }
        Goods buyGoods=new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("========buy方法的结束=========");
    }
    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}