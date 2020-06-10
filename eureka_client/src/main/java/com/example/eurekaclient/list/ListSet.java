package com.example.eurekaclient.list;

import com.example.eurekaclient.datastructure.Linked.peopel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName ListSet
 * @Description
 * @Author changfan
 * @Date 2019-7-30 17:47
 * @Version 1.0
 **/
public class ListSet {
    private static ListSet listSet;


    private static ListSet  getInstence(){
       return   listSet == null ? new ListSet():listSet;
    }
    private static void List(){
        List list = new ArrayList();
    }


    private static  void  Set(){
        Set set = new HashSet();
        set.add(null);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) throws Exception{
        peopel peopel = new peopel("张三",18,"M");
        peopel peopel2 = new peopel("张三",18,"M");
        System.out.println(peopel.hashCode()==peopel2.hashCode());
        System.out.println(peopel.equals(peopel2));

        System.out.println(peopel.hashCode());
        System.out.println(1111111>>>16);

        peopel peopel1= peopel.getClass().newInstance();
    }
}