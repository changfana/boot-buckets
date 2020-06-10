package com.example.eurekaclient.reflect;

import com.example.eurekaclient.datastructure.Linked.peopel;

import java.util.Random;

/**
 * @ClassName reflect
 * @Description
 * @Author changfan
 * @Date 2019-8-13 14:47
 * @Version 1.0
 **/
public class reflect {

    public static Random rand = new Random(47);
    private  static  void reflectTest() throws  ClassNotFoundException{
        //当使用.class获取对象，里面的静态块不会被加载，使用Class.forName则会加载
      /*  peopel peopel2 = new peopel();
        Object  peopel = Class.forName("com.example.eurekaclient.datastructure.Linked.peopel");
        System.out.println(peopel.getClass().getName());
        Object peo = peopel.class;
        System.out.println(peopel == peo);
        System.out.println(peopel2 == peopel);*/

         //当使用.class获取对象，当访问 static final修改且有初始值的常量时，类不会被初始化，否则会被初始化
        /*Class peo = peopel.class;
        System.out.println(".class创建对象完成");
        System.out.println(peopel.aa);
        System.out.println(peopel.height);
        System.out.println(peopel.name);*/


        peopel peopel = new peopel();
    }


    public static void main(String[] args) {
        try {
            reflectTest();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
//            System.out.println(e.toString());
        }
    }
}