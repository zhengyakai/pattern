package com.yakai.pattern.proxy;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2017/12/29
 * @version: 1.0
 * @modify:
 * @description:
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    //默认是潘金莲的代理
    public WangPo(){
        this.kindWomen = new PanJinlian();
    }
    //还可以是其他这个类型女人的代理
    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void throwEyesToMan() {
        //实际上是被代理人在抛媚眼
        this.kindWomen.throwEyesToMan();
    }

    @Override
    public void happyWithMan() {
        //被代理人和男人happy     王婆老了，做不动了
        this.kindWomen.happyWithMan();
    }
}
