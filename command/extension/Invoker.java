package com.yakai.pattern.command.extension;

import com.yakai.pattern.command.abstraction.Command;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/08
 * @version: 1.0
 * @modify:
 * @description: 接头人的职责就是接受命令并执行
 */
public class Invoker {

    private Command command;
    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
