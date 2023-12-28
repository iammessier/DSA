package org.example.LinearSearch;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(5);
        list.add(1, 2);
        System.out.println(list);
    }
}
