package com.yakai.pattern.builder;

import java.util.List;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/04
 * @version: 1.0
 * @modify:
 * @description:
 */
public abstract class CarBuilder {
    //建造一个执行顺序模型
    public abstract void setSequence(List<String> sequence);
    //设置完毕顺序后，就可以直接拿这个模型
    public abstract CarModel getCarModel();
}
