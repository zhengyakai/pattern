package com.yakai.pattern.abstractfactory.factory;

import com.yakai.pattern.abstractfactory.abstracthuman.Human;
import com.yakai.pattern.abstractfactory.enums.HumanEnum;
import org.springframework.util.StringUtils;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public abstract class AbstractHumanFactory implements HumanFactory {
    public Human createHuman(HumanEnum humanEnum){
        Human human = null;
        if(!StringUtils.isEmpty(humanEnum.getValue())){
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
