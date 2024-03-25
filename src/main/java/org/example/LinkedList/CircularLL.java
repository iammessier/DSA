package org.example.LinkedList;
public class CircularLL {
    Node head;
    Node tail;
    public CircularLL(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void insertEnd(int x){
        Node temp = new Node(x);
        if(head==null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            tail.next = temp;
            tail = temp;

        }
    }
    public void delete(int value){
        Node curr = head;
        if(curr == null){
            return;
        }
        if(curr.value == value){
            head = curr.next;
            tail.next = curr;
        }
        do{
            Node n = curr.next;
            if(n.value == value){
                curr.next = n.next;
                break;
            }
            curr = curr.next;
        }while (curr!=head);

    }
    public void display(){
        Node temp = head;
        try{
            do {
                System.out.print(temp.value+"-->");
                temp = temp.next;
            }while (temp!=head);
            System.out.println("End");
        }catch (NullPointerException e){
            System.out.println("List is Empty");
        }


    }
    public static void main(String[] args){
        CircularLL clist = new CircularLL();
        clist.insertEnd(1);
        clist.insertEnd(2);
        clist.insertEnd(3);
        clist.display();
        clist.delete(2);
        clist.display();
        clist.delete(1);
        clist.display();
//        clist.delete(3);
        clist.display();
    }

}
