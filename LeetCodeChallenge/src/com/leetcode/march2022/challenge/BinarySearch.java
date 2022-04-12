package com.leetcode.march2022.challenge;

public class BinarySearch {

	public int search(int[] nums, int target) {
		if (nums == null) return -1;
		for (int i=0; i< nums.length; i++) {
			if (nums[i] == target)
			return i;
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
