package com.example.eurekaclient.datastructure.Linked;






import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName Linked
 * @Description
 * @Author changfan
 * @Date 2019-7-19 15:48
 * @Version 1.0
 **/
public class Linked {

  public   LinkedList reverse(LinkedList head){
      

      return  null;
  }





    public static   void reverse() {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> templist = new LinkedList<>();
        int i = 0;
        while (i < 6) {
            list.add(i);
            i++;
        }
        Iterator<Integer> it = list.iterator();
        int m;
        while (it.hasNext() && i >= 0) {
            m = it.next();
            templist.addFirst(m);
            i--;
        }
        list = templist;
        System.out.println(list);
    }

    public static void main(String[] args) {
        reverse();
    }
}