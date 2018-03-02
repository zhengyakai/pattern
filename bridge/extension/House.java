package com.yakai.pattern.bridge.extension;

import com.yakai.pattern.bridge.abstraction.Product;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description:
 */
public class House extends Product {
    @Override
    public void beProduced() {
        System.out.println("房子是这样子盖好的。。。");
    }

    @Override
    public void beSold() {
        System.out.println("房子这样被销售。。。");
    }
}
