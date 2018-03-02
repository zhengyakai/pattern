package com.yakai.pattern.observer.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/10
 * @version: 1.0
 * @modify:
 * @description:
 */
public class LiSi implements Observer {
    //首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
    @Override
    public void update(final Observable o, final Object obj) {
        System.out.println("李斯：观察到李斯活动，开始向老板汇报了...");
        this.reportToQiShiHuang(obj.toString());
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }

    //向秦始皇报告
    private void reportToQiShiHuang(final String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
