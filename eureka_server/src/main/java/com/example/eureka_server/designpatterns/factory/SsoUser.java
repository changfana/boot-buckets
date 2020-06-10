package com.example.eureka_server.designpatterns.factory;

public class SsoUser implements User {
    @Override
    public void userdata() {
        System.out.println("这是SsoUser数据");
    }
}
