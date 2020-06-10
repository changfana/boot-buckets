package com.example.eurekaclient.datastructure.Linked;



/**
 * @ClassName NodeReverse
 * @Description
 * @Author changfan
 * @Date 2019-7-22 14:12
 * @Version 1.0
 **/
public class NodeReverse {


    public static Node  reverse(Node head){
        //如果链表为空或只有一个元素直接返回
        if(head.getNext()==null){
            return head;
        }
        Node p1,p2 =null;
        p1=head;
        while(p1.getNext()!=null){
             p2 = p1.getNext();
             head.setNext(p2.getNext());
             p2.setNext(p1);
             p1 = p2;
        }


      /*  while(head.getNext() != null){
             p2=head.getNext();
             head.setNext(p2.getNext());
             p2.setNext(p1);
             p1 = p2;
        }*/

        return p2;

}




















    public static void main(String[] args) {
        Node node = new Node(1,new Node(2,new Node(3,new Node(4,null))));
        Node n2,n3 =null;
        node.toString();
        Node node2 = reverse(node);
        System.out.println(node2);
     /*  n3=node;
      for (int a=1;a<10;a++){
          n2 = node.getNext();
          n2.setNext(new Node(1000,null));
          n3= n2;
      }
      System.gc();*/
    }

}