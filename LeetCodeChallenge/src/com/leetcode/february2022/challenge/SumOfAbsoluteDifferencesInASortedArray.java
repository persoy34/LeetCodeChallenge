package com.leetcode.february2022.challenge;

import java.util.Arrays;

public class SumOfAbsoluteDifferencesInASortedArray {
	// (nums[i] - nums[0]) + (nums[i] - nums[1]) + ... + (nums[i] - nums[i-1]) + (nums[i+1] - nums[i]) 
	// + (nums[i+2] - nums[i]) + ... + (nums[n-1] - nums[i])
	// (nums[i] * i - (nums[0] + nums[1] + ... + nums[i-1])) + 
	// ((nums[i+1] + nums[i+2] + ... + nums[n-1]) - nums[i] * (n-i-1))
	public int[] getSumAbsoluteDifferences(int[] nums) {
		int [] result = new int[nums.length];
		int total=0;
		int [] left = new int [nums.length];
		int [] right = new int[nums.length];
		for (int i=0; i<nums.length; i++) {
			total+=nums[i];
			left[i]=total;
		}
		total=0;
		for (int i=nums.length-1; i>=0; i--) {
			total+=nums[i];
			right[i]=total;
		}
		for (int i=0; i<nums.length; i++) {
			int leftC=0;
			int rightC=0;
			if(i+1<nums.length)
				rightC=right[i+1];
	        if(i-1>=0)
	        	leftC=left[i-1];
	        result[i]=Math.abs(rightC-(nums.length-1-i)*nums[i])+Math.abs(leftC-i*nums[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int [] nums = {1,4,6,8,10};
		SumOfAbsoluteDifferencesInASortedArray absoluteDifferencesInASortedArray = new SumOfAbsoluteDifferencesInASortedArray();
		int [] result = absoluteDifferencesInASortedArray.getSumAbsoluteDifferences(nums);
		System.out.println(Arrays.toString(result));

	}

}
