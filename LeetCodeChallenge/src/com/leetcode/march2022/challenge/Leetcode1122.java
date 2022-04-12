package com.leetcode.march2022.challenge;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Leetcode1122 {
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		Map<Integer,Integer> map = new TreeMap<>();
		int [] result = new int[arr1.length];
		int j=0;
		for (int i=0; i<arr1.length; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
		}
		for (int i=0; i<arr2.length; i++) {
			int freq= map.get(arr2[i]);
			while (freq > 0) {
				result[j]=arr2[i];
				j++;
				freq--;
			}
			map.put(arr2[i], freq);
		}
		
		
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if (entry.getValue() > 0) {
				int freq = entry.getValue();
				while (freq >0) {
					result[j]= entry.getKey();
					j++;
					freq--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int [] arr2 = {2,1,4,3,9,6};
		int [] result = relativeSortArray(arr1, arr2);
		System.out.println(Arrays.toString(result));

	}

}
