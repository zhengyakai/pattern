package com.yakai.pattern.templetemethod;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/04
 * @version: 1.0
 * @modify:
 * @description:
 */
public class HummerH2 extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2启动...");
    }

    @Override
    protected void enginBoom() {
        System.out.println("悍马H2引擎发出响声...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停止...");
    }
}
