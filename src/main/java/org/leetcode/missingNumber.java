package org.leetcode;

class missingNumber {
    public static int missingNumber(int[] nums) {
        int iter = 0;
        while(iter!=nums.length){
            if(nums[iter] == nums.length){
                iter++;
                continue;
            }else{
                if(nums[iter] == iter){
                    iter++;
                }else{
                    int index = nums[iter];
                    int temp = nums[index];
                    nums[index] = nums[iter];
                    nums[iter] = temp;
                }
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));

    }
}