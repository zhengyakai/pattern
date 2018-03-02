package com.yakai.pattern.decorator.extension;

import com.yakai.pattern.decorator.abstraction.SchoolReport;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/09
 * @version: 1.0
 * @modify:
 * @description: 四年级成绩单
 */
public class FourthGradeSchoolReport extends SchoolReport {


    @Override
    public void report() {
        System.out.println("尊敬的XXX家长：");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签字为:"+name);
    }
}
