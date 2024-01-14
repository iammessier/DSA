package org.example.BinarySearch;

public class InfinitSizeArray {
    static int findTarget(int[] arr, int target){
        int[] indexex = findIndex(arr, target);
        int start_index = indexex[0];
        int end_index = indexex[1];
        while(start_index<= end_index) {
            int mid = start_index + (end_index - start_index) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start_index = mid + 1;
            } else {
                end_index = mid - 1;
            }
        }
        return -1;// element not found
    }
    static int[] findIndex(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the search space until the target is within the range
        while (true){
            if (arr[start]< target && arr[end]>target){
                return new int[]{start, end};

            }
            start = end;
            end *= 2;
        }

    }    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 8, 10 ,21,31, 43,45,87,98,100,1010,1012,646464,79887987};
        int target = 5;
        System.out.println(findTarget(arr, target));
    }
}
