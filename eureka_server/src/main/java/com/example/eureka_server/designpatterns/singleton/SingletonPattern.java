package com.example.eureka_server.designpatterns.singleton;


public class SingletonPattern {

     private volatile static SingletonPattern singletonPattern = null;

    /**
     * @author: changfan
     * @date: 2019-11-19
     * @description: Double Check Locking 双检查锁机制
     * @param: [a, b]
     * @return: com.example.eureka_server.designpatterns.singleton.SingletonPattern
     */
    static  SingletonPattern getInstance(){
        try {
            if(singletonPattern == null){
                Thread.sleep(200);
                synchronized (SingletonPattern.class){
                    if(singletonPattern==null)
                    singletonPattern = new SingletonPattern();
            }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singletonPattern;
    }

}
