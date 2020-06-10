package com.example.eureka_server.designpatterns.factory;

public class NwUser  implements User {
    @Override
    public void userdata() {
        System.out.println("这是NwUser数据");
    }
}
