package com.example.ordercenter_boot.model;

/**
 * @ClassName userBean
 * @Description
 * @Author changfan
 * @Date 2019-6-12 17:16
 * @Version 1.0
 **/

public class userBean {

    private String staffId;

    private String  name;

    private  int age;

    private  String userLoginId;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    @Override
    public String toString() {
        return "userBean{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", userLoginId='" + userLoginId + '\'' +
                '}';
    }

}