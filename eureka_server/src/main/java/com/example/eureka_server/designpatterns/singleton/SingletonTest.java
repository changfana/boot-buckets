package com.example.eureka_server.designpatterns.singleton;

public class SingletonTest extends Thread{

    @Override
    public void run() {
        System.out.println(SingletonPattern.getInstance());
    }
    public static void main(String[] args) {

        SingletonTest[] mts = new SingletonTest[10];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new SingletonTest();
        }
        Long startTime = System.currentTimeMillis();
        System.out.println("开始时间："+ startTime);
        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
        System.out.println("一共耗时："+ (System.currentTimeMillis()-startTime+"ms"));
    }
}
