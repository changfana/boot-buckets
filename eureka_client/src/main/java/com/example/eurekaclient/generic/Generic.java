package com.example.eurekaclient.generic;


/**
 * @ClassName generic
 * @Description
 * @Author changfan
 * @Date 2019-8-15 17:04
 * @Version 1.0
 **/
public class Generic {

  /*  private  T  a;

    private   void SetA(T a){
            this.a = a;
    }*/

    public   static <K,V>void  GenericMethod(K k,V v){
        System.out.println(k.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
    }

    public static void main(String[] args) {
       Generic.GenericMethod("123",123);
    }


}