package com.yakai.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/04
 * @version: 1.0
 * @modify:
 * @description:
 */
public abstract class CarModel {

    private volatile List<String> sequence = new ArrayList<>();

    protected abstract  void start();
    protected abstract  void enginBoom();
    protected abstract  void alarm();
    protected abstract  void stop();

    protected final void run(){
        for (int i = 0,length = this.sequence.size(); i < length; i++) {
            String actionName = sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }
            if(actionName.equalsIgnoreCase("enginBoom")){
                this.enginBoom();
            }
            if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }
            if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }
        }
    }

    public final void setSequence(final List<String> sequence) {
        this.sequence = sequence;
    }
}
