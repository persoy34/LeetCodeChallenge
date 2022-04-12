package com.leetcode.february2022.challenge;

import java.util.Arrays;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		if (nums.length ==1 ) return nums[0];
		int n = nums.length/2+1;
		int majorityElem=0;
		for (int i= nums.length-1; i>=0; i--) {
			int count =1;
			int j = i-1;
			while (j>=0 && nums[j] == nums[i]) {
				j--;
				count++;
			}
			if (count == n) {
				majorityElem = nums[i];
				break;
			}
			
		}
		return majorityElem;
	}

	public static void main(String[] args) {
		int [] nums = {2,2,1,1,1,2,2};
		int result = majorityElement(nums);
		System.out.println(result);

	}

}
