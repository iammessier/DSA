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
        System.out.println("End");
    }
    public void insertAtIndex(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        } if(index==size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if (size<= 1){
            deleteFirst();
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
        }
        int value = tail.value;
        tail = temp;
        size--;
        return value;

    }
    //questions
    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }

        }
        tail = node;
        tail.next = null;
    }

    private class Node{

        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }

    }
}
