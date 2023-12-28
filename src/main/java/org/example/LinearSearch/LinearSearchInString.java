package org.example.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "Jay Nahata";
        char target = 'a';
        System.out.println(search(name, target));


    }
    static String search(String name, char target){
        ArrayList<Integer> arr = new ArrayList<>(10);
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                arr.add(i);
            }

        }
        return Arrays.toString(new ArrayList[]{arr});
    }
}
