package org.example.BinarySearch;


public class RecursiveBinarySearch {
    static int search(int[] arr, int target, int start, int end){
        if(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;

            } else if (target> arr[mid]) {
                return search(arr, target, mid+1, end);
            }else {
                return search(arr, target, start, mid-1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4 ,5 ,6, 7, 10, 11, 55, 67};
        int target = 5;
        int start = 0;
        int end = arr.length -1;
        System.out.println(search(arr, target, start, end));
    }
}
