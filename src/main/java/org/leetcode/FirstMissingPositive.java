package org.leetcode;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int temp = 0;
        while(i!=nums.length){
            int index = 0;
            if(nums[i] == i+1 || nums[i]<=0 || nums[i]>nums.length || (nums[i]==nums[nums[i]-1])) i++;
            else{
                index = nums[i]-1;
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;

            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=j+1) return j+1;

        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(firstMissingPositive(nums));
    }
}
