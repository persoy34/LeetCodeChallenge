package com.leetcode.april2022.challenge;

import java.util.Arrays;

public class NumberOfGoodPairs {

	public int numIdenticalPairs(int[] nums) {
		Arrays.sort(nums);
		int i=0;
		int count=0;
		while (i< nums.length) {
			int j=i+1;
			while (j< nums.length && nums[i] == nums[j]) {
				count++;
				j++;
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3};
		NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
		int result = goodPairs.numIdenticalPairs(nums);
		System.out.println(result);

	}

}
