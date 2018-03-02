package com.yakai.pattern.visitor.demo;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/16
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Manager extends Employee {

    //经理关心业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(final String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(final IVisitor visitor) {
        visitor.visit(this);
    }
}
