package com.example.eurekaclient.datastructure.Linked;

/**
 * @ClassName Node
 * @Description
 * @Author changfan
 * @Date 2019-7-22 17:48
 * @Version 1.0
 **/
public class Node {

    private  int  val;   //数据域

    private  Node  next;   //指针域

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}