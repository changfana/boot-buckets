package com.example.eurekaclient.basics;

import com.example.eurekaclient.datastructure.Linked.peopel;
import com.example.eurekaclient.lamda.lamda;
import com.example.eurekaclient.lamda.testLamdas;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName Array
 * @Description
 * @Author changfan
 * @Date 2019-8-14 17:10
 * @Version 1.0
 **/
public class Array {
    static  int [] arrays = new int[]{9,3,2,7,6,0,1};



    static void ArraySort(int[] aa){
          Arrays.sort(arrays);
        for(int a=0;a<arrays.length;a++){
            System.out.println(arrays[a]);
        }

        for (int i = 0,j =0;i<aa.length-1;j = ++i){
            int a = aa[i+1];
            if (aa[i+1]<aa[j]){
                aa[j+1] = aa[j];
                aa[j] = a;
            }

        }
    }


    public static void main(String[] args) {
     /*  ArraySort(arrays);
        for (int i=0;i<arrays.length;i++)
            System.out.println(arrays[i]);*/

    /*  int j = 1;
      if(j-- == 1){
          System.out.println("aaaaaa");
      }*/

     /*   int i =1;
        int j =i;
        j = i++;
        System.out.println(i);
        System.out.println(j);*/
        Integer[] a2 = { 34, 3, 457, 8, 34, 32, 7, 7, 4, 3456, 87, 23 };
//        Arrays.sort(a2,(o1,o2)-> o2- o1);

        Arrays.sort(a2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(a2));


    }


    private static <T>void  test(testLamdas<? super T> testLamda){
               testLamda.testMethod("",2);
    }
}