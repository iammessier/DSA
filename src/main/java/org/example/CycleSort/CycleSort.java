package org.example.CycleSort;

import java.util.Arrays;

public class CycleSort {
    static void sort(int[] arr){
        int iter = 0;
        int temp = 0;
        int index = 0;
        while(iter != arr.length-1){
            if(iter==arr[iter]-1){
                iter++;
            }else{
                index = arr[iter]-1;
                temp = arr[index];
                arr[index] = arr[iter];
                arr[iter] = temp;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,6,7,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

