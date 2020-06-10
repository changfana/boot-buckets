package com.example.eurekaclient.jvm.escapeandstack;

import com.example.eurekaclient.datastructure.Linked.peopel;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StackEscape
 * @Description
 * @Author changfan
 * @Date 2019-8-1 10:24
 * @Version 1.0
 **/
public class StackEscape {

    private static  peopel peopel;
    
    /**
     * @Author  changfan
     * @Description   对于方法内的对象，不能被方法外访问的，将会被分配到栈上，不会触发gc
     * @Date  10:27 2019-8-1
     * @Param []
     * @throws
     * @Return void
     */
    private static void  Stack(){
        List<peopel> list = new ArrayList<>();
        for (int a=0;a<99999999;a++) {
            peopel peopel = new peopel("zhangsan",18,"M");
            list.add(peopel);
            System.out.println("对象分配完成");
        }
}

    /**
     * @Author  changfan
     * @Description   对于方法内的对象，能被方法外访问的，将会被分配到栈上，将会触发gc
     * @Date  10:27 2019-8-1
     * @Param []
     * @throws
     * @Return void
     */
     private  static void  Stack2(){
         for (int a=0;a<99999999;a++) {
             try {
                 Thread.sleep(1000);
                 peopel = new peopel("zhangsan",18,"M");
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
//             System.out.println("对象分配完成");
         }
     }

    public static void main(String[] args) {
       /* peopel peopel = new peopel("张三",18,"M");
        peopel peopel2 = new peopel("张三",18,"M");*/
         Stack();

    }
}