package com.yakai.pattern.decorator.abstraction;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/09
 * @version: 1.0
 * @modify:
 * @description:
 */
public abstract class SchoolReport {

    //学校发的成绩单明细
    public abstract void report();
    //家长签字
    public abstract void sign(String name);

}
