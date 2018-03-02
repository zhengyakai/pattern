package com.yakai.pattern.strategy;

/**
 * @description: 装妙计的锦囊
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2017/12/29
 * @version: 1.0
 * @modify:
 */
public class Context {

    private IStrategy iStrategy;

    Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    //使用计谋
    public void useStrategy(){
        iStrategy.operate();
    }
}
