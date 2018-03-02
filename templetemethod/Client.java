package com.yakai.pattern.templetemethod;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/04
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        HummerH1 h1 = new HummerH1();
        //悍马太吵了，不让它鸣笛
        h1.setAlarm(false);
        h1.run();
    }
}
