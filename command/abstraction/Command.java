package com.yakai.pattern.command.abstraction;

import com.yakai.pattern.command.extension.CodeGroup;
import com.yakai.pattern.command.extension.PageGroup;
import com.yakai.pattern.command.extension.RequireGroup;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description:
 */
public abstract class Command {
    protected RequireGroup rg = new RequireGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
