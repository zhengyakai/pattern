package com.yakai.pattern.chainofresponsibility.intface;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/15
 * @version: 1.0
 * @modify:
 * @description:
 */
public interface IHandler {

    //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}
