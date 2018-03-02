package com.yakai.pattern.builder;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/04
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Benz extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车启动了.....");
    }

    @Override
    protected void enginBoom() {
        System.out.println("奔驰车的引擎响起来了.....");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车鸣笛.....");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停了.....");
    }
}
