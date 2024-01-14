package org.example.LinearSearch;
import java.util.Scanner;

public class Question4 {
    static int getMedian(int size1, int[] array, int size2, int[] array1){
        int[] newArr = new int[size1+size2];
        for (int i = 0; i < size1; i++) {
            newArr[i] = array[i];

        }
        for (int i = 0; i < size2; i++) {
            newArr[size1+i] = array1[i];
        }
        int start = 0;
        int end = newArr.length-1;
        int mid = start + (end-start)/2;
        if(size1+size2 %2 == 0){
            return (newArr[mid]+newArr[mid+1])/2;
        }
        else{
            return (newArr[mid+1]);
        }
    }
    public static void main(String[] args) {
        int size1 = 5;
        int size2 = 5;
        int[] array = {1,2,3,5,8};
        int[] array2 = {8,11,12,15,17};
        System.out.println(getMedian(size1,array,size2,array2));
    }
}
