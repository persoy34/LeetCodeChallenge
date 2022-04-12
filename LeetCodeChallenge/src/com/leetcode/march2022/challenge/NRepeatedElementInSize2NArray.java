package com.leetcode.march2022.challenge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
	public int repeatedNTimes(int[] nums) {
		int N= nums.length /2;
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0 ; i< nums.length; i++) {
				countMap.put(nums[i], countMap.getOrDefault(nums[i], 0)+1);	
		}
		Iterator< Integer> iter= countMap.keySet().iterator();
		while (iter.hasNext()) {
			int key= iter.next();
			int value= countMap.get(key);
			if (value == N) return key;
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,3};
		NRepeatedElementInSize2NArray array = new NRepeatedElementInSize2NArray();
		int result = array.repeatedNTimes(nums);
		System.out.println(result);

	}

}
