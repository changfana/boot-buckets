package com.example.eurekaclient.datastructure.Linked;

import com.example.eurekaclient.reflect.reflect;
import org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial;

import java.util.Objects;



/**
 * @ClassName peopel
 * @Description
 * @Author changfan
 * @Date 2019-7-23 19:28
 * @Version 1.0
 **/
public class peopel {



    public  static  int height =  reflect.rand.nextInt(1000);

   public static  final    String name="zhangsan";

   public static final   int  aa ;

    static  {
//        name = "李四";
        aa = 100;
        System.out.println("这是peopel的static代码块,name="+name);
    }

    int age ;

    String SEX;

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public peopel(int age, String SEX) {
        this.age = age;
        this.SEX = SEX;
    }

    public peopel(String name, int age, String SEX) {
        this.age = age;
        this.SEX = SEX;
    }

    public peopel() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        peopel peopel = (peopel) o;
        return age == peopel.age &&
                Objects.equals(name, peopel.name) &&
                Objects.equals(SEX, peopel.SEX);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, SEX);
    }


}