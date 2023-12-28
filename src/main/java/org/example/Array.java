package org.example;

import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++){
            int x = sc.nextInt();
            arr[i] = x;

        }
        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}