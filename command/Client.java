package com.yakai.pattern.command;

import com.yakai.pattern.command.abstraction.Command;
import com.yakai.pattern.command.extension.AddRequireCommand;
import com.yakai.pattern.command.extension.Invoker;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Command addCmd = new AddRequireCommand();
        Invoker invoker = new Invoker(addCmd);
        invoker.action();

    }
}
