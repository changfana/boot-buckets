package com.example.eurekaclient;


import java.io.IOException;
import java.util.concurrent.*;

/**
 * @ClassName mainTest
 * @Description
 * @Author changfan
 * @Date 2019-7-9 16:51
 * @Version 1.0
 **/
public class mainTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,10,5,TimeUnit.SECONDS,workQueue);
        threadPoolExecutor.prestartAllCoreThreads();  //预启动所有核心线程
        for (int a=0;a<10;a++){

        }
//        System.in.read();
       Thread.sleep(3000);
        System.out.println("线程执行完毕");
//        System.gc();
    }
}