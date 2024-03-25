package org.example.Stack;
import java.sql.SQLOutput;
import java.util.*;

public class InbuildExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(70);
        deque.add(90);
        deque.add(91);
        deque.add(92);
        deque.add(93);
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());






    }
}
