package com.yakai.pattern.visitor.demo;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/16
 * @version: 1.0
 * @modify:
 * @description:
 */
public interface IVisitor {

    //定义可以普通员工
    public void visit(CommonEmployee commonEmployee);
    //定义可以访问部门经理
    public void visit(Manager manager);

}
