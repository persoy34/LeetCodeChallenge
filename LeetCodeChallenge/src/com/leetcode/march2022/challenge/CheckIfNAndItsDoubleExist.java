package com.leetcode.march2022.challenge;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {

	public boolean checkIfExist(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i=0; i< arr.length; i++) {
			map.put(arr[i], i);
		}
		for (int i=0; i< arr.length; i++) {
			int key = 2*arr[i];
			if (map.containsKey(key) && map.get(key) != i) {
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		int [] arr = {10,2,5,3};
		CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
		boolean result = checkIfNAndItsDoubleExist.checkIfExist(arr);
		System.out.println(result);

	}

}
