package com.example.eureka_server.designpatterns.factory;

public class SsoFactory implements DataFactory {

    @Override
    public User getUser() {
        return new SsoUser();
    }

    @Override
    public Org getOrg() {
        return new SsoOrg();
    }
}
