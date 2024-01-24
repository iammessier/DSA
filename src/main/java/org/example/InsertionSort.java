package org.example;

import java.util.Arrays;

public class InsertionSort {

    static void sort(int[] arr){
        int p, temp;
        for (int i = 0; i < arr.length-1; i++) {
            p = i+1;
            while (p>0){
                if(arr[p]<arr[p-1]){
                    temp = arr[p-1];
                    arr[p-1] = arr[p];
                    arr[p] = temp;
                    p--;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,6,8,9,51};
        sort(arr);
    }
}
