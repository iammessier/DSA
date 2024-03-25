package org.example.LinkedList;

import java.util.Scanner;
public class Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Q1 list=new Q1();
        int a=sc.nextInt();
        while(a!=0){
            list.insertEnd(a);
            a=sc.nextInt();
        }
        int pos = sc.nextInt();
        list.rotate(pos);
        list.print();
    }
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }
    Node head;
    Node tail;
    public void insertEnd(int d){
        Node newnode=new Node(d);
        Node temp=head;
        if(head==null){
            head=newnode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        tail=newnode;
    }
    public void rotate(int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(x!=0){
            temp.next = head;
            head.prev = temp;
            head = head.next;
            head.prev = null;
            temp.next.next = null;
            temp = temp.next;
            x--;
        }


    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}