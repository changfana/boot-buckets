package com.example.eureka_server.designpatterns.factory;

public class NwOrg implements Org {
    @Override
    public void orgData() {
        System.out.println("这是NwOrg数据");
    }
}
