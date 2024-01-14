package org.example.BinarySearch;
import java.util.Arrays;
public class SearchIn2D {
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;
        while(r<=matrix.length-1 && c>=0){
            if(target == matrix[r][c]){
                return new int[]{r, c};
            }if(matrix[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int[][] matrix= {
            {10,20,30},
            {11,22,33},
            {44,55,66}
        };
        int target = 33;
        System.out.println(Arrays.toString(search(matrix, target)));

    }
}
