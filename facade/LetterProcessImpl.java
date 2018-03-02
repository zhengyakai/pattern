package com.yakai.pattern.facade;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(final String context) {
        System.out.println("填写信的内容："+context);
    }

    @Override
    public void writeEnvelope(final String envelope) {
        System.out.println("填写信封信息："+envelope);
    }

    @Override
    public void letterIntoEnvelop() {
        System.out.println("将写好的信装入信封...");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件...");
    }
}
