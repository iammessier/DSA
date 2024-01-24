package org.example.LinkedList;

public class LL {
    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;

    }
    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        node.next = null;
        if(head == null){
            head = tail;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }
    public void insertAtIndex(int value, int index){
        if(index==0){
            insertFirst(value);
        } else {
            Node node = new Node(value);
            Node temp = head;
            int tempIndex = 0;
            while(tempIndex!=index-1){
                temp = temp.next;
            }
            Node byPass = temp.next;
            temp.next = node;
            node.next = byPass;
        }
    }


    private class Node{

        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }

    }
}
