package org.example.BinarySearch;

public class CealingNumber {
    static int cealingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target == arr[mid]){
                return mid;

            }else if(target>arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {4 ,5 ,6, 7, 10, 11, 55, 67};
        int target = 8;
        System.out.println(cealingNumber(arr, target));
    }
}
