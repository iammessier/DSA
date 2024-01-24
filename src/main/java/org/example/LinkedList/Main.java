package org.example.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertLast(5);
        list.insertAtIndex(5,0);
        list.display();
    }
}
