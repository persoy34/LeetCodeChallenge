package com.leetcode.march2022.challenge;

import java.util.Arrays;

public class FindSubsequenceOfLengthKWithTheLargestSum {

	public int[] maxSubsequence(int[] nums, int k) {
		 	if (k == nums.length) return nums;
		 	int [] copy = new int [nums.length];
		 	int [] result = new int [k];
		 	copy = Arrays.copyOf(nums, nums.length);
		 	Arrays.sort(nums);
		 	for (int i=0; i< nums.length-k; i++) {
		 		int val = nums[i];
		 		int index=0;
		 		while (val != copy[index]) {
		 			index++;
		 		}
		 		copy[index]= Integer.MIN_VALUE;
		 	}
		    int j=0;
		    int index=0;
		 	while (j < k) {
		 		if (copy[index] == Integer.MIN_VALUE) {
		 			index++;
		 			continue;
		 		} else {
		 			result[j++]=copy[index++];
		 		}
		 	}
		 	return result;
		 	
	}

	public static void main(String[] args) {
		int [] nums = {63,-74,61,-17,-55,-59,-10,2,-60,-65};
		int k = 9;
		FindSubsequenceOfLengthKWithTheLargestSum findSubsequenceOfLengthKWithTheLargestSum = new FindSubsequenceOfLengthKWithTheLargestSum();
		int [] result=findSubsequenceOfLengthKWithTheLargestSum.maxSubsequence(nums, k);
		System.out.println(Arrays.toString(result));
	}

}
