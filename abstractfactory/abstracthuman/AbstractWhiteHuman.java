package com.yakai.pattern.abstractfactory.abstracthuman;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void eat() {
        System.out.println("白种人吃");
    }

    @Override
    public void run() {
        System.out.println("白种人跑");
    }
}
