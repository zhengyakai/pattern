package com.yakai.pattern.visitor.demo;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/16
 * @version: 1.0
 * @modify:
 * @description:
 */
public class CommonEmployee extends Employee {

    private String job;

    public String getJob() {
        return this.job;
    }

    public void setJob(final String job) {
        this.job = job;
    }

    @Override
    public void accept(final IVisitor visitor) {
        visitor.visit(this);
    }
}
