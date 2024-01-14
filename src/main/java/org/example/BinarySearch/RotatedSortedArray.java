package org.example.BinarySearch;

public class RotatedSortedArray {

    static int findPivot(int[] arr){
         int start = 0;
         int end = arr.length-1;
         while(start<= end){
             int mid = start + (end- start) / 2;
             // 4 cases
             if(mid < end && arr[mid]>arr[mid+1] ){
                 return mid;
             }
             if (mid > start && arr[mid] < arr[mid-1]){
                 return mid-1;
             }
             if (arr[mid]<=arr[start]){
                 end = mid-1;

             }
             else{
                 start = mid + 1;
             }
         }
         return -1;
    }
    static int binarySearch(int[] arr, int target , int start, int end){

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
        return -1; //element not found

    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            //normal binary search
            return binarySearch(arr, target, 0, arr.length-1);
        }else {
            if(target == arr[pivot]){
                return pivot;
            }
            int x = binarySearch(arr, target, 0, pivot-1 );
            if (x==-1){
                x = binarySearch(arr, target, pivot+1, arr.length-1);
            }
            if(x!=-1){
                return x;//target found
            }
            return -1;

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        System.out.println(search(arr, target));
    }

}
