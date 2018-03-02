package com.yakai.pattern.command.extension;

import com.yakai.pattern.command.abstraction.Command;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description:
 */
public class AddRequireCommand extends Command {

    @Override
    public void execute() {
        super.rg.findTargetGroup();
        super.rg.add();
        super.pg.add();
        super.cg.add();
        super.rg.plan();
    }
}
