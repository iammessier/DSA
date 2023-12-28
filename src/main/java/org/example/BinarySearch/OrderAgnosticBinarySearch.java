package org.example.BinarySearch;

public class OrderAgnosticBinarySearch {
    static int orderAgnosticBinarySearch(int[] arr,int target,int start,int end){
        int mid = start + (end-start)/2;
        boolean isAsc = arr[start]<arr[end];
        if(start<=end){
            if(target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if(target> arr[mid]){
                    return orderAgnosticBinarySearch(arr, target, mid+1, end);
                } else {
                    return orderAgnosticBinarySearch(arr, target, start, mid-1);
                }
            }else {
                if(target> arr[mid]){
                    return orderAgnosticBinarySearch(arr, target, start, mid-1);
                } else {
                    return orderAgnosticBinarySearch(arr, target, mid+1, end);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {4 ,5 ,6, 7, 10, 11, 55, 67};
        int[] arr = {789,745,741,753,123,100,2,-25,-545};
        int target = 100;
        System.out.println(orderAgnosticBinarySearch(arr, target, 0, arr.length-1));
    }
}
