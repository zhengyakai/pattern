package com.yakai.pattern.chainofresponsibility.impl;

import com.yakai.pattern.chainofresponsibility.intface.IWomen;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/15
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Women implements IWomen {
    //1 是未结婚，2 是已经结婚的，而且丈夫建在，3 是丈夫去世了的
    //为家从父,出嫁从夫,夫死从子
    private int type;
    private String request;

    public Women(final int type, final String request) {
        this.type = type;
        this.request = request;
    }


    public Women() {
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
