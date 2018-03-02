package com.yakai.pattern.proxy;

/**
 * @description: 潘金莲
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2017/12/29
 * @version: 1.0
 * @modify:
 */
public class PanJinlian implements KindWomen {
    @Override
    public void throwEyesToMan() {
        System.out.println("潘金莲对男人抛媚眼...");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲和男人happy...");
    }
}
