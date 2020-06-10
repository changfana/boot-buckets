package com.example.eureka_server.designpatterns.factory;

public class NwFactory implements DataFactory {

    @Override
    public User getUser() {
        return new NwUser();
    }

    @Override
    public Org getOrg() {
        return new NwOrg();
    }
}
