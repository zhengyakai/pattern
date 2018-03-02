package com.yakai.pattern.proxy;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2017/12/29
 * @version: 1.0
 * @modify:
 * @description:  西门庆
 */
public class XiMenqing {

    public static void main(String[] args) {
        //西门庆找到王婆
        WangPo wangPo = new WangPo();
        //西门庆说想和潘金莲happy，王婆代理潘金莲，表面上是王婆在做，实际上爽的是潘金莲
        wangPo.throwEyesToMan();
        wangPo.happyWithMan();
    }
}
