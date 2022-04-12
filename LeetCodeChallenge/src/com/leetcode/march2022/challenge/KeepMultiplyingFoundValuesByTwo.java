package com.leetcode.march2022.challenge;

import java.util.HashMap;
import java.util.Map;

public class KeepMultiplyingFoundValuesByTwo {

	public int findFinalValue(int[] nums, int original) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, i);
		}
		boolean done=false;
		while (!done) {
			if (map.containsKey(original)) {
				original= original *2;
			}
			else {
				done=true;
				break;
			}
		}
		return original;
	}

	public static void main(String[] args) {
		int [] nums = {2,7,9};
		int  original = 3;
		KeepMultiplyingFoundValuesByTwo byTwo = new KeepMultiplyingFoundValuesByTwo();
		int result = byTwo.findFinalValue(nums, original);
		System.out.println(result);

	}

}
