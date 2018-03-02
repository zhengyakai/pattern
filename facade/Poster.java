package com.yakai.pattern.facade;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/03
 * @version: 1.0
 * @modify:
 * @description:
 */
public class Poster {
    public static void main(String[] args) {
        String context = "亲爱的蕾蕾....";
        String envelope = "河北省邯郸市....";
        PostOffice office = new PostOffice();
        office.sendLetter(context,envelope);
    }
}
