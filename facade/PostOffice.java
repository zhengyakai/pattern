package com.yakai.pattern.facade;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:  门面模式：邮局  统一处理写信，将信装入信封，邮寄信件
 */
public class PostOffice {

    private LetterProcess process = new LetterProcessImpl();

    public void sendLetter(String context,String envelop){
        process.writeContext(context);
        process.writeEnvelope(envelop);
        process.letterIntoEnvelop();
        process.sendLetter();
    }
}
