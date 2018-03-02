package com.yakai.pattern.factorymethod;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public class NvWa {

    public static void main(String[] args) {
        Human yellowHuman = HumanFactory.creatHuman(YellowMan.class);
        yellowHuman.eat();
        yellowHuman.run();

    }
}
