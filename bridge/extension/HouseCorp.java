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
public class HouseCorp extends Corp {

    public HouseCorp(final House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱。。。");
    }
}
