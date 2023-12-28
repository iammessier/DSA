package org.example.LinearSearch;

public class LinearSearch {
    static int check (int[] arr,int target_element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target_element){
                return i;
            }
        }
        return -1;
    }
    //to find max number in array
    static int max(int[] arr){
        int max_num = arr[0];
        for(int i: arr){
            if (i> max_num){
                max_num = i;
            }
        }
        return max_num;
    }
    public static void main(String[] args) {
        //find a number in array
        int[] arr = {1, 123, 1000, 154, 1};
        int target_element = 1134;
        System.out.println(check(arr, target_element));
        System.out.println(max(arr));


    }

}
