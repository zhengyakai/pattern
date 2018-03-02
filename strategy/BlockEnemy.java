package com.yakai.pattern.strategy;

/**
 * @description:
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2017/12/29
 * @version: 1.0
 * @modify:
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("第三个锦囊妙计：孙夫人阻挡追兵");
    }
}
