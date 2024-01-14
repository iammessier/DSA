package org.example.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // first find maxinmum index and then swap it with last position
            int end = arr.length-i-1;
            int start = 0;
            int maxIndex = max(arr, start, end);
            swap(arr, maxIndex, end);


        }
    }
    static void swap(int[] arr, int maxIndex, int end){
        int temp = arr[end];
        arr[end] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
    static int max(int[] arr,int start,int end){
        int max = start;
        for (int i = start+1; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
