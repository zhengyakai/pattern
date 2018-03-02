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
public class CodeGroup extends Group {
    @Override
    public void findTargetGroup() {
        System.out.println("找到编码组。。。");
    }

    @Override
    public void add() {
        System.out.println("让编码组添加功能。。。");
    }

    @Override
    public void delete() {
        System.out.println("让编码组删除功能。。。");
    }

    @Override
    public void update() {
        System.out.println("让编码组修改功能。。。");
    }

    @Override
    public void plan() {
        System.out.println("让编码组出计划。。。");
    }
}
