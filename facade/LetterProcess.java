package com.yakai.pattern.facade;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public interface LetterProcess {
    //写信
    public void writeContext(String context);
    //写信封
    public void writeEnvelope(String envelope);
    //把信装到信封里
    public void letterIntoEnvelop();
    //邮寄信件
    public void sendLetter();
}
