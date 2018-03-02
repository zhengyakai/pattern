package com.yakai.pattern.adapter;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/04
 * @version: 1.0
 * @modify:
 * @description:
 */
public class App {

    public static void main(String[] args) {
        IUserInfo userInfo = new OuterUserInfoAdapter();
        for (int i = 0; i < 10; i++) {
            userInfo.getMobileNumber();
        }
    }
}
