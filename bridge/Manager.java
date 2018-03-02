package com.yakai.pattern.bridge;

import com.yakai.pattern.bridge.abstraction.Corp;
import com.yakai.pattern.bridge.extension.*;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Manager {

    public static void main(String[] args) {
        System.out.println("-------房地产公司是这个样子运行的-------");
        //先找到我的公司
        HouseCorp houseCorp = new HouseCorp(new House());
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-------山寨公司是这样运行的-------");
        ShanzhaiCorp shanzhaiCorp = new ShanzhaiCorp(new Clothes());
        shanzhaiCorp.makeMoney();

    }
}
