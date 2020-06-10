package com.example.eurekaclient.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName countdownlatch
 * @Description
 * @Author changfan
 * @Date 2019-9-27 13:49
 * @Version 1.0
 **/
public class countdownlatch {

         public  static  void CountDownLatch() throws Exception{
             CountDownLatch begin = new CountDownLatch(1);
             CountDownLatch end  = new CountDownLatch(10);
             CountServiceImpl []count = new CountServiceImpl[10];
             ExecutorService executorService = Executors.newFixedThreadPool(10);
             for(int a=0; a<10;a++)
                 count[a] = new CountServiceImpl(a,begin,end);
             for(CountServiceImpl countService :count)
                      executorService.execute(countService);
              begin.countDown();
              end.await();
              System.out.println("所有分配的线程全部执行完成");
         }


    public static void main(String[] args) {
        try {
            CountDownLatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}