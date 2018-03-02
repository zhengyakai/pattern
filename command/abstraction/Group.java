package com.yakai.pattern.command.abstraction;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description: 抽象类 项目组
 */
public abstract class Group {

    public abstract void findTargetGroup();
    public abstract void add();
    public abstract void delete();
    public abstract void update();
    public abstract void plan();
}
