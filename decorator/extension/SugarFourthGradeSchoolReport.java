package com.yakai.pattern.decorator.extension;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/09
 * @version: 1.0
 * @modify:
 * @description:
 */
public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport {

    //先给老爸说下各科最高分
    private void highReport(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    //再说下我这次在班里的排名
    private void reportSort(){
        System.out.println("我在班里的排名是30");
    }

    @Override
    public void report() {
        this.highReport();
        this.reportSort();
        super.report();
    }

    @Override
    public void sign(final String name) {
        super.sign(name);
    }
}
