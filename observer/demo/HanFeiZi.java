package com.yakai.pattern.observer.demo;

import java.util.Observable;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/10
 * @version: 1.0
 * @modify:
 * @description:
 */
public class HanFeiZi extends Observable {

    //韩非子吃早饭
    public void haveBreakfast(){
        System.out.println("韩非子吃早饭了。。。");
        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }
    //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        super.setChanged();
        this.notifyObservers("韩非子在娱乐");
    }
}
