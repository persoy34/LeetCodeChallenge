package com.geeksofgeeks.code;

public class FindMissingNumber {
	
	public static void main(String ...strings) {
		int  arr[] = {1, 2, 5, 6, 3, 7, 8};
		int n=8;
		int total = (n*(n+1))/2;
		int count=0;
		for (int number:arr) {
			count+=number;
		}
		System.out.println(total - count);
	}

}
