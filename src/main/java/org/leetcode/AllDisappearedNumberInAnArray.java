package org.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class AllDisappearedNumberInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int iter = 0;
        while(iter!=nums.length){
            if((nums[iter] == iter+1)||(nums[iter]==nums[nums[iter]-1])){
                iter++;
            }
            else {
                int index = nums[iter]-1;
                int temp = nums[index];
                nums[index] = nums[iter];
                nums[iter] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                arr.add(i+1);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
