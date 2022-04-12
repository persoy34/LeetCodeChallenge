package com.leetcode.february2022.challenge;

public class ThreeConsecutiveOdds {
	public static boolean threeConsecutiveOdds(int[] arr) {
		if (arr == null || arr.length < 3)
            return false;
        int n= arr.length-3;
        for (int i=0; i<=n; i++) {
        	if (arr[i] % 2 !=0 && arr[i+1] % 2 != 0 && arr[i+2]%2 !=0)
        		return true;
        	
        }
        return false;
    }

	public static void main(String[] args) {
		int [] arr = {1,3,2};
		boolean result = threeConsecutiveOdds(arr);
		System.out.println(result);

	}

}
