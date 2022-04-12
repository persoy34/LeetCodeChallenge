package com.leetcode.february2022.challenge;

public class ValidPerfectSquare {

	public static boolean isPerfectSquare(int num) {
	       
	         long left =1;
	        long right = num;
			while (left <= right) {
			 long mid = (left + right) / 2;
	         if (mid * mid > num)
	             right= mid -1;
	         else if (mid * mid < num)
	             left= mid +1;
	         else return true;   
			}
			return false;
	}

	public static void main(String[] args) {
		boolean result = isPerfectSquare(2147483647);
		System.out.println(result);
		

	}

}
