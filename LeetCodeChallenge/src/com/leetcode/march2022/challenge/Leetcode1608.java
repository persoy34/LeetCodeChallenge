package com.leetcode.march2022.challenge;

public class Leetcode1608 {

	public static int specialArray(int[] nums) {
		for (int i=0; i<=nums.length; i++) {
			int count =0;
			for (int num: nums) {
				if (num > i)
					count++;
			}
			if (count == i)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] nums = {3,5};
		int result = specialArray(nums);
		System.out.println(result);

	}

}
