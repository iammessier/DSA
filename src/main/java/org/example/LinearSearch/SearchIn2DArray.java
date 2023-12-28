package org.example.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 54, 6},
                {2, 5, 4},
                {3, 5, 9000, 4}
        };
        int target_number = 4;
        ArrayList<int[]> result = search(arr, target_number);

        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Maximum number in given 2D array is "+ max(arr));
    }

    static ArrayList<int[]> search(int[][] arr, int target_number) {
        ArrayList<int[]> indexes = new ArrayList<>();

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target_number) {
                    indexes.add(new int[]{row, column});
                }
            }
        }

        return indexes;
    }
    static int max(int[][] arr){
        int maximum = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > maximum) {
                    maximum = anInt;
                }
            }
        }
        return maximum;
    }
}
