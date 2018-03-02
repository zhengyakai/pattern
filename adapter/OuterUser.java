package com.yakai.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    /*
    * 用户的基本信息
    */
    @Override
    public Map<String, String> getUserBaseInfo() {
        HashMap<String,String> baseInfoMap = new HashMap<>(2);
        baseInfoMap.put("userName", "这个员工叫混世魔王....");
        baseInfoMap.put("mobileNumber", "这个员工电话是....");
        return baseInfoMap;
    }
    /*
    * 员工的家庭信息
    */
    @Override
    public Map<String, String> getUserHomeInfo() {
        HashMap<String,String> homeInfo = new HashMap<>(2);
        homeInfo.put("homeTelNumbner", "员工的家庭电话是....");
        homeInfo.put("homeAddress", "员工的家庭地址是....");
        return homeInfo;
    }
    /*
    * 员工的工作信息，比如职位了等
    */
    @Override
    public Map<String, String> getUserOfficeInfo() {
        HashMap<String,String> officeInfo = new HashMap<>(2);
        officeInfo.put("jobPosition","这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是....");
        return officeInfo;
    }
}