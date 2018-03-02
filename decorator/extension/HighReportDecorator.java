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
public class HighReportDecorator extends Decorator {
    public HighReportDecorator(final SchoolReport sr) {
        super(sr);
    }

    private void highReport(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        //先报告各科最高分，再展示成绩单
        this.highReport();
        super.report();
    }
}
