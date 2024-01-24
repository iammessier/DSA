package org.leetcode;

import java.util.*;

public class AllDuplicatesInArray {
    public static List<Integer> findDuplicate(int[] nums){
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
                arr.add(nums[i]);
            }
        }
        Collections.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(nums));
    }
}
