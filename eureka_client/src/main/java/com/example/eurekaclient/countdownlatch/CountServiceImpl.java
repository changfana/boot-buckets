package com.example.eurekaclient.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountServiceImpl
 * @Description
 * @Author changfan
 * @Date 2019-9-27 15:53
 * @Version 1.0
 **/
public class CountServiceImpl  extends Thread  {
    private int count;
    private CountDownLatch begin;
    private CountDownLatch end;

    public CountServiceImpl(int count, CountDownLatch begin, CountDownLatch end) {
        this.count = count;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public  void run() {
        try {
            begin.await();
            System.out.println("我是："+count);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            end.countDown();
            System.out.println("剩余线程数:"+end);
        }

    }
}