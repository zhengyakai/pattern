package com.yakai.pattern.abstractfactory;

import com.yakai.pattern.abstractfactory.abstracthuman.Human;
import com.yakai.pattern.abstractfactory.factory.FemaleHumanFactory;
import com.yakai.pattern.abstractfactory.factory.HumanFactory;
import com.yakai.pattern.abstractfactory.factory.MaleHumanFactory;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public class NvWa {
    public static void main(String[] args) {

        //创建黑种男人
        HumanFactory maleHumanFac = new MaleHumanFactory();
        Human blackMaleHuman = maleHumanFac.createBlackHuman();
        blackMaleHuman.eat();
        blackMaleHuman.run();
        blackMaleHuman.sex();
        //创建黑种女人
        HumanFactory femaleHumanFac = new FemaleHumanFactory();
        Human blackFemaleHuman = femaleHumanFac.createBlackHuman();
        blackFemaleHuman.eat();
        blackFemaleHuman.run();
        blackFemaleHuman.sex();

        //.....
    }
}
