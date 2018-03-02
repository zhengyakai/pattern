package com.yakai.pattern.decorator;

import com.yakai.pattern.decorator.abstraction.SchoolReport;
import com.yakai.pattern.decorator.extension.FourthGradeSchoolReport;
import com.yakai.pattern.decorator.extension.HighReportDecorator;
import com.yakai.pattern.decorator.extension.SortReportDecorator;
import com.yakai.pattern.decorator.extension.SugarFourthGradeSchoolReport;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/09
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Father {


    public static void main(String[] args) {

        //成绩单拿过来
        SchoolReport sr;
        //原装的成绩单
        sr = new FourthGradeSchoolReport();
        //加了最高分说明的成绩单
        sr = new HighReportDecorator(sr);
        //又加了成绩排名的说明
        sr = new SortReportDecorator(sr);
        //看成绩单
        sr.report();
        //然后老爸，一看，很开心，就签名了
        sr.sign("老郑");
    }
}
