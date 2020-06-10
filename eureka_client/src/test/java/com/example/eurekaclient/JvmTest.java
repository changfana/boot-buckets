package com.example.eurekaclient;

import java.util.Map;

/**
 * @ClassName JvmTest
 * @Description
 * @Author changfan
 * @Date 2019-8-13 9:51
 * @Version 1.0
 **/
public class JvmTest {

    public static void main(String[] args) {
        boolean a = true;
            while(a){
                break;
            }
        try {
            Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
            for (Map.Entry<Thread,StackTraceElement[]> aaa : map.entrySet()){
                System.out.println("This  thread name  is ："+aaa.getKey().getName());
                System.err.println("value is :"+aaa.getValue().toString() );
            }
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("我这里是final的方法！");
        }


        String b ="abc";
        b= "aaa";
    }
}