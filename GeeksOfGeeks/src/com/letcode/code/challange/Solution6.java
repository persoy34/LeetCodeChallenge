package com.letcode.code.challange;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution6 {
	public int countElements(int[] arr) {
		Set<Integer> set = new HashSet<>();
		Arrays.sort(arr);
		for (int i=0 ; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int count=0;
		for (int i=0; i< arr.length-1; i++) {
			if (set.contains(arr[i]+1)) {
			count++;
			}
		}
       
		return count;
    }
	public static void main(String[] args) {
		int [] arr = {1,1,2,2};
		Solution6 solution6 = new Solution6();
		int total = solution6.countElements(arr);
		System.out.println(total);

	}

}
