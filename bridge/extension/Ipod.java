package com.yakai.pattern.bridge.extension;

import com.yakai.pattern.bridge.abstraction.Product;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description: 山寨品ipod
 */
public class Ipod extends Product {
    @Override
    public void beProduced() {
        System.out.println("山寨品ipod被生产。。。");
    }

    @Override
    public void beSold() {
        System.out.println("山寨品ipod被销售。。。");
    }
}
