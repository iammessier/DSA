package org.example.BinarySearch;
import java.util.Arrays;
public class PositionOfElement {
    static int[] firstAndLastOccurance(int[] arr, int target) {
        int[] ans = {-1, -1};

        int first_occurance = -1;
        int last_occurance = -1;
        int start = 0;
        int end = arr.length-1;
        //for first occurance
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid+1;
            }else{
                //when target = mid
                first_occurance = mid;
                end = mid-1;
            }
        }
         start = 0;
        end = arr.length-1;
        //for last occurance
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid+1;
            }else{
                //when target = mid
                last_occurance = mid;
                start = mid+1;
            }
        }
        if(first_occurance==-1 && last_occurance==-1){
            return ans;
        }
        return new int[]{first_occurance, last_occurance};
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 7, 7, 7, 8, 9, 10};
        int target = 10;
        System.out.println(Arrays.toString(firstAndLastOccurance(arr, target)));
    }
}