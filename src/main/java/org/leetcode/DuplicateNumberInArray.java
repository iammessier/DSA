package org.leetcode;

import java.util.ArrayList;

public class DuplicateNumberInArray {
    public static int findDuplicate(int[] nums){

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
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
