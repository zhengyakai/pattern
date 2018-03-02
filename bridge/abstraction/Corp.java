package com.yakai.pattern.bridge.abstraction;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/05
 * @version: 1.0
 * @modify:
 * @description:
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product){
        this.product = product;
    }
    protected  void makeMoney(){
        //产品被生产
        this.product.beProduced();
        //产品被销售
        this.product.beSold();
    }

}
