package com.example.eurekaclient.jvm.gc;

import com.example.eurekaclient.datastructure.Linked.peopel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName GcTest
 * @Description
 * @Author changfan
 * @Date 2019-7-26 17:23
 * @Version 1.0
 **/
public class GcTest {

    static List list;

    private static void StackMemory() {
        while (true) {
            StackMemory();
        }
    }


    private void HeapMerory() {

    }

    private static void MemoryLeaks() {
        /*//静态集合类引起内存泄露
         list = new ArrayList();
        for (int a=0;a<=10;a++){
           peopel peopel = new peopel("张三",15,"M");
           list.add(peopel);
           peopel=null;
        }*/

        //当集合里面的对象属性被修改以后，再调remove将不起作用
        Set<peopel> set = new HashSet<>();
        peopel peopel = new peopel("李四", 15, "F");
        peopel peopel2 = new peopel("王五", 15, "F");
        peopel peopel3 = new peopel("赵六", 15, "F");
        set.add(peopel);
        set.add(peopel2);
        set.add(peopel3);
        peopel=null;
        peopel3.setAge(100);
        set.remove(peopel3);
        set.add(peopel3);
    }

    public static void main(String[] args) {
        MemoryLeaks();
        StackMemory();

    }
}