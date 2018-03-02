package com.yakai.pattern.templetemethod;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/04
 * @version: 1.0
 * @modify:
 * @description:  悍马抽象类
 */
public abstract class HummerModel {

    //默认是可以鸣笛的
    private boolean isAlarm = true;

    protected abstract void start();
    protected abstract void enginBoom();
    protected abstract void alarm();
    protected abstract void stop();

    //这就是模板方法  声明成final 表示不允许被子类重写修改
    protected final void run(){
        this.start();
        this.enginBoom();
        //允许鸣笛才调用鸣笛的方法。
        if(this.isAlarm){
            this.alarm();
        }
        this.stop();
    }

    public boolean isAlarm() {
        return isAlarm;
    }

    //提供set方法
    public final void setAlarm(final boolean alarm) {
        isAlarm = alarm;
    }
}
