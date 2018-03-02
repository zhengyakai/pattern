package com.yakai.pattern.adapter;

import java.util.Map;

/**
 * @author: Yakai Zheng
 * @email: zhengyakai@aliyun.com
 * @date: Create on 2018/01/04
 * @version: 1.0
 * @modify:
 * @description:
 */
public class OuterUserInfoAdapter extends OuterUser implements IUserInfo {

    private Map<String,String> baseInfo = super.getUserBaseInfo();
    private Map<String,String> homeInfo = super.getUserHomeInfo();
    private Map<String,String> officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        return baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return homeInfo.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return baseInfo.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return officeInfo.get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return officeInfo.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return homeInfo.get("homeTelNumbner");
    }
}
