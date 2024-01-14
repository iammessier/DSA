package org.example.BinarySearch;
import java.util.Arrays;
public class SearchInMountainArray {
    static int findIndex(int[] arr){
        int start = 0;
        int end = arr.length-1 ;
        while(start<end){
            int mid = start + (end-start)/2;
            if (arr[mid] <arr[mid+1]){
                //ascending part
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,5,12,2};
        System.out.println(findIndex(arr));
    }
}
