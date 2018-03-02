package com.yakai.pattern.factorymethod;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2017/12/29
 * @version: 1.0
 * @modify:
 * @description:
 */
public class WhiteMan implements Human {
    @Override
    public void eat() {
        System.out.println("白种人吃饭");
    }

    @Override
    public void run() {
        System.out.println("白种人跑..");
    }
}
