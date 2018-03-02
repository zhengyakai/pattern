package com.yakai.pattern.observer.demo;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/10
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
