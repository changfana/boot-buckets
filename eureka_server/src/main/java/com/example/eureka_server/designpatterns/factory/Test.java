package com.example.eureka_server.designpatterns.factory;

public class Test {
    public static void main(String[] args) {

        DataFactory dataFactory = new SsoFactory();
        dataFactory.getUser().userdata();
        dataFactory.getOrg().orgData();


        DataFactory dataFactory1 =  new NwFactory();
        dataFactory1.getUser().userdata();
        dataFactory1.getOrg().orgData();
    }
}
