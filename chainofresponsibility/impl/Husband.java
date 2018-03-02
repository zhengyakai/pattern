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
public class Husband implements IHandler {
    @Override
    public void HandleMessage(final IWomen women) {
        System.out.println("妻子的请示是:"+women.getRequest());
        System.out.println("丈夫的回答:同意!");
    }
}
