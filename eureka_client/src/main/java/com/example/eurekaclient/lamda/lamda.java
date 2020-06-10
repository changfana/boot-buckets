package com.example.eurekaclient.lamda;

import com.example.eurekaclient.datastructure.Linked.peopel;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName lamda
 * @Description
 * @Author changfan
 * @Date 2019-8-15 17:43
 * @Version 1.0
 **/
interface  testLamda{
    void testMethod(String a,int b);
}

public class lamda {
    private  static  String a="zhangsan"; /*private  static int b = 18;*/
     public    static void  Main(testLamda testLamda,String a, int b){
         testLamda.testMethod(a,b);
     }


    public static void main(String[] args) {

      /*   //匿名内部类平常调用
         Main(new testLamda() {
             @Override
             public void testMethod(String a, int b) {
                 System.out.println("是一个匿名内部类");
             }
         },"zhangsan",20);
          //lamda表达式调用
          Main((abc,bcd)-> System.out.println("这是一个匿名内部类==="+"a:"+abc+";b:"+bcd), "lisi",22);
*/

        List list = new ArrayList();
        list.add(123);
        list.add("abc");
        list.add(new peopel());
        list.forEach(m -> System.out.println(m));


    }
}