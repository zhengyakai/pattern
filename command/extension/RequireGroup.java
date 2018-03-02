package com.yakai.pattern.command.extension;

import com.yakai.pattern.command.abstraction.Group;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description:
 */
public class RequireGroup extends Group {
    @Override
    public void findTargetGroup() {
        System.out.println("找到需求组。。。");
    }

    @Override
    public void add() {
        System.out.println("让需求组添加功能。。。");
    }

    @Override
    public void delete() {
        System.out.println("让需求组删除功能。。。");
    }

    @Override
    public void update() {
        System.out.println("让需求组修改功能。。。");
    }

    @Override
    public void plan() {
        System.out.println("让需求组出计划。。。");
    }
}
