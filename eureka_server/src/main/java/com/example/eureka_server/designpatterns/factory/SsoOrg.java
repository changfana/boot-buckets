package com.example.eureka_server.designpatterns.factory;


public class SsoOrg implements  Org {
    @Override
    public void orgData() {
        System.out.println("这是SsoOgr数据");
    }
}
