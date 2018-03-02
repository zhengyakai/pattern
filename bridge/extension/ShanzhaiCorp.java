package com.yakai.pattern.bridge.extension;

import com.yakai.pattern.bridge.abstraction.Corp;
import com.yakai.pattern.bridge.abstraction.Product;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description:
 */
public class ShanzhaiCorp extends Corp {

    public ShanzhaiCorp(final Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚钱。。。");
    }
}
