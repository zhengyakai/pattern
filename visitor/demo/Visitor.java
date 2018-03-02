package com.yakai.pattern.visitor.demo;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/16
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(final CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(final Manager manager) {
        System.out.println(this.getManager(manager));
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee){
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE?"女":"男")
                + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }
    //组装出部门经理的信息
    private String getManager(Manager manager){
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩："+manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }
    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee){
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作："+commonEmployee.getJob()+"\t";
        return basicInfo + otherInfo;
    }
}

