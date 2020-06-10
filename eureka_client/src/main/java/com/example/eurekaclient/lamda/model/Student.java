package com.example.eurekaclient.lamda.model;

import sun.applet.Main;
import sun.management.Agent;

/**
 * @ClassName Student
 * @Description
 * @Author changfan
 * @Date 2019-8-16 10:28
 * @Version 1.0
 **/
public class Student {
        private static  final String name = "zhangsan";

        private static  final int age = 18;


    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名类实现Runable接口");
            }
        }).start();

        new Thread(()-> System.out.println("\"匿名类实现Runable接口\"")).start();
    }
}