package com.yakai.pattern.strategy;

/**
 * @description:
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2017/12/29
 * @version: 1.0
 * @modify:
 */
public class GreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("第二个锦囊妙计：求吴国太开绿灯，放行！");
    }
}
