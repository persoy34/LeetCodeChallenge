package com.leetcode.march2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class CountHillsAndValleysInAnArray {
	public int countHillValley(int[] nums) {
		int valleyOrHill =0;
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<nums.length; i++) {
		   if (i+1 < nums.length) {
		    	if (nums[i] == nums[i+1]) continue;
		    }
		    list.add(nums[i]);
		   	
		}
		for (int i=1; i< list.size()-1; i++) {
			int val= list.get(i-1);
			int val1 = list.get(i);
			int val2 = list.get(i+1);
			if (val1 > val && val1 > val2)
				valleyOrHill++;
			else if (val1 < val && val1 < val2)
				valleyOrHill++;
		}
		return valleyOrHill;

	}

	public static void main(String[] args) {
		CountHillsAndValleysInAnArray andValleysInAnArray = new CountHillsAndValleysInAnArray();
		int [] nums = {2,4,1,1,6,5};
		int result = andValleysInAnArray.countHillValley(nums);
		System.out.println(result);

	}

}
