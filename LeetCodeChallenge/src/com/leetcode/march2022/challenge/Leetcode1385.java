package com.leetcode.march2022.challenge;

public class Leetcode1385 {
	
	 public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		 int count = 0;
	        for (int i=0; i< arr1.length; i++) {
	        	boolean allSmaller = true;
	        	for (int j=0; j < arr2.length; j++) {
	        		if (Math.abs(arr1[i] - arr2[j]) <= d) {
	        			allSmaller = false;
	        			break;
	        		}
	        	}
	        	if (allSmaller)
	        		count++;
	        }
	        return count;
	 }

	public static void main(String[] args) {
		int [] arr1 = {4,5,8};
		int [] arr2 = {10,9,1,8};
		int d = 2;
		int result = findTheDistanceValue(arr1, arr2, d);
		System.out.println(result);

	}

}
