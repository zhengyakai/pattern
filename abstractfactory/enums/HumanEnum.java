package com.yakai.pattern.abstractfactory.enums;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public enum HumanEnum {

    YelloMaleHuman("com.yakai.pattern.abstractfactory.bean.YellowMaleHuman"),
    YellowFemaleHuman("com.yakai.pattern.abstractfactory.bean.YellowFemaleHuman"),
    WhiteMaleHuman("com.yakai.pattern.abstractfactory.bean.WhiteMaleHuman"),
    WhiteFemaleHuman("com.yakai.pattern.abstractfactory.bean.WhiteFemaleHuman"),
    BlackMaleHuman("com.yakai.pattern.abstractfactory.bean.BlackMaleHuman"),
    BlackFemaleHuman("com.yakai.pattern.abstractfactory.bean.BlackFemaleHuman");
    private String value = "";
    private HumanEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
