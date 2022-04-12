package com.leetcode.february2022.challenge;

public class FirstMissingPositiveNumber {

	public static int firstMissingPositive(int[] nums) {
		if (nums==null || nums.length ==0) return 1;
		int n= nums.length;
		boolean containsOne = false;
		for (int i=0; i< n; i++) {
			if (nums[i]==1) {
				containsOne = true;
			} else if (nums[i] > n || nums[i]<=0) {
				nums[i]=1;
			}
		}
		if (!containsOne) return 1;
		for (int i=0; i< n; i++) {
			int index = Math.abs(nums[i])-1;
			if (nums[index] < 0)
				continue;
			nums[index]=-1 * nums[index];
			
		}
		for (int i=0; i<n; i++) {
			if (nums[i] > 0) return i+1;
		}
		
		return n+1;
	}

	public static void main(String[] args) {
		int [] nums = {3,4,-1,1};
		int result =firstMissingPositive(nums);
		System.out.println(result);
		

	}

}
