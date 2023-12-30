package org.example.BinarySearch;

public class SmallestLetterGreaterThanTarget {
    static char smallestLetterGreaterThanTarget(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]>target){
                end = mid-1;
            }else {
                start = mid + 1;

            }
        }
        return arr[start % (arr.length)];
    }
    public static void main(String[] args) {
        char[] arr = {'a','b'};
        char target = 'z';
        System.out.println(smallestLetterGreaterThanTarget(arr, target));

    }
}
