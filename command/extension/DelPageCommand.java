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
public class DelPageCommand extends Command {
    @Override
    public void execute() {
        super.pg.findTargetGroup();
        super.pg.delete();
        super.pg.plan();
    }
}
