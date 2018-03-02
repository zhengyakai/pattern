package com.yakai.pattern.builder;

import java.util.ArrayList;
import java.util.List;

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
        Director director = new Director();
        Benz aBenz = director.getABenz();
        aBenz.run();
        Benz bBenz = director.getBBenz();
        bBenz.run();
    }
}
