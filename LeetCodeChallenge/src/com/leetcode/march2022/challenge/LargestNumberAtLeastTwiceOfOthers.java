package com.leetcode.march2022.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestNumberAtLeastTwiceOfOthers {
	public int dominantIndex(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		if (nums.length == 1) return 0;
		for (int i=0; i< nums.length; i++) {
			map.put(nums[i], i);
		}
		Arrays.sort(nums);
		if (nums[nums.length-1]>= nums[nums.length-2]*2) {
			return map.get(nums[nums.length-1]);
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		LargestNumberAtLeastTwiceOfOthers atLeastTwiceOfOthers = new LargestNumberAtLeastTwiceOfOthers();
		int result = atLeastTwiceOfOthers.dominantIndex(nums);
		System.out.println(result);

	}

}
