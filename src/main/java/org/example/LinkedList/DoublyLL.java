package org.example.LinkedList;

public class DoublyLL {

    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        if(head!= null){
            head.prev = node;
        }
        node.prev = null;
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node!= null){
            System.out.print(node.value+"-->");
            last = node;
            node = node.next;
        }
        System.out.print("End");
        System.out.println("print in reverse");
        while (last!= null){
            System.out.print(last.value+"-->");
            last = last.prev;
        }
        System.out.print("End");
        System.out.println();

    }
    public void insertLast(int value){
        Node temp = head;
        Node node = new Node(value);
        if(temp==null){
            insertFirst(value);
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
            node.next = null;
        }

    }
    public void insert(int after, int value){
        Node temp = find(after);
        Node node = new Node(value);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        node.next.prev = node;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;

        }
        return null;
    }

    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }
        public Node( int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}
