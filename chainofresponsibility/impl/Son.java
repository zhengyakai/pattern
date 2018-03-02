package com.yakai.pattern.chainofresponsibility.impl;

import com.yakai.pattern.chainofresponsibility.intface.IHandler;
import com.yakai.pattern.chainofresponsibility.intface.IWomen;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/15
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Son implements IHandler {
    @Override
    public void HandleMessage(final IWomen women) {
        System.out.println("母亲的请示是:"+women.getRequest());
        System.out.println("儿子的回答:同意!");
    }
}
