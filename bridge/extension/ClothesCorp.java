package com.yakai.pattern.bridge.extension;

import com.yakai.pattern.bridge.abstraction.Corp;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description:
 */
public class ClothesCorp extends Corp {

    public ClothesCorp(final Clothes clothes) {
        super(clothes);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装厂公司赚小钱。。。");
    }
}
