package org.example.BinarySearch;

public class BiotonicArray {
    private static int findIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid= start + (end-start)/2;
            if(arr[mid] < arr[mid+1]){
                //ascending path
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,5};
        System.out.println(findIndex(arr));

    }
}
