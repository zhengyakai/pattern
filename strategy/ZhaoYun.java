package com.yakai.pattern.strategy;

/**
 * @description: 使用锦囊妙计的人：赵云
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2017/12/29
 * @version: 1.0
 * @modify:
 */
public class ZhaoYun {

    public static void main(String[] args) {

        Context context ;
        //使用第一条计谋
        context = new Context(new BackDoor());
        context.useStrategy();
        System.out.println("\n\n");
        //使用第二条计谋
        context = new Context(new GreenLight());
        context.useStrategy();
        System.out.println("\n\n");
        //使用第三条计谋
        context = new Context(new BlockEnemy());
        context.useStrategy();
    }
}
