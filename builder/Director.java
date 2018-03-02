package com.yakai.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/05
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Director {

    private List<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * 获得A类型的奔驰
     * @return
     */
    public Benz getABenz(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (Benz) this.benzBuilder.getCarModel();
    }

    /**
     * 获得B类型的车
     * @return
     */
    public Benz getBBenz(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("enginBoom");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (Benz) this.benzBuilder.getCarModel();
    }

    //.....可以根据不同的方法获得各种类型，执行顺序不同的车


}
