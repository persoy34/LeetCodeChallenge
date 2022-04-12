package com.leetcode.march2022.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
	
	public List<Integer> minSubsequence(int[] nums) {
		Arrays.sort(nums);
		List<Integer> result = new ArrayList<>();
		int total=0;
		for (int i=nums.length-1; i>-1; i--) {
			result.add(nums[i]);
			total+=nums[i];
			if (isStrictlyGreater (total, i, nums))
				return result;
		}
		return result;
		
        
    }
	
	private boolean isStrictlyGreater(int sum, int lastIndex, int[] nums) {
		if (lastIndex < 0) return true;
		int total=0;
		for (int i=0; i< lastIndex; i++) {
			total+=nums[i];
		}
		return sum > total ? true: false;
		
	}

	public static void main(String[] args) {
		int [] nums = {6};
		MinimumSubsequenceInNonIncreasingOrder increasingOrder = new MinimumSubsequenceInNonIncreasingOrder();
		List<Integer> result = increasingOrder.minSubsequence(nums);
		System.out.println(result);

	}

}
