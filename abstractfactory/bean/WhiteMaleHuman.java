package com.yakai.pattern.abstractfactory.bean;

import com.yakai.pattern.abstractfactory.abstracthuman.AbstractWhiteHuman;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("白种男人");
    }
}
