package com.yakai.pattern.chainofresponsibility.intface;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/15
 * @version: 1.0
 * @modify:
 * @description: 古代的"三从"女性
 */
public interface IWomen {
    //获得个人情况
    public int getType();
    //获得请示, 要出去干什么..
    public String getRequest();
}
