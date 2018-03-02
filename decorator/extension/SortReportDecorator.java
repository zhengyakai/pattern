package com.yakai.pattern.decorator.extension;

import com.yakai.pattern.decorator.abstraction.Decorator;
import com.yakai.pattern.decorator.abstraction.SchoolReport;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/09
 * @version: 1.0
 * @modify:
 * @description:
 */
public class SortReportDecorator extends Decorator {
    public SortReportDecorator(final SchoolReport sr) {
        super(sr);
    }

    private void SortReport(){
        System.out.println("我这次考试排名20");
    }


    @Override
    public void report() {
        //展示成绩单后，再告诉排名情况
        super.report();
        this.SortReport();
    }
}
