package com.leetcode.january2022.challenge;

import java.util.Arrays;


public class MaxNumberOfKSumPairs {
	public int maxOperations(int[] nums, int k) {
		int left = 0; int right = nums.length-1;
        int counter = 0;
        Arrays.sort(nums);
        while(left<right){
            int sum = nums[left]+nums[right];
            if (sum == k){
                left++; 
                right--;
                counter++;
            }else if (sum<k){
                left++;
            }else{
                right--;
            }
        }
        return counter;
	}

	public static void main(String[] args) {
		int[] nums = { 2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
		int k =3;
		MaxNumberOfKSumPairs kSumPairs = new MaxNumberOfKSumPairs();
		int result = kSumPairs.maxOperations(nums, k);
		System.out.println(result);
	}

}
