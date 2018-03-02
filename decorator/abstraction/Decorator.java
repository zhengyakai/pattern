package com.yakai.pattern.decorator.abstraction;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/09
 * @version: 1.0
 * @modify:
 * @description:
 */
public abstract class Decorator extends SchoolReport{

    private SchoolReport sr;
    public Decorator(SchoolReport sr){
        this.sr = sr;
    }
    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(final String name) {
        this.sr.sign(name);
    }
}
