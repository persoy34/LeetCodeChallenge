package com.geeksofgeeks.code;

import java.util.*;

public class GFG {
	private static Scanner scanner = new Scanner(System.in);
	private static int binarySearch(int [] arr, int val, int first, int last) {
		int midle = (first + last)/2;
		if (midle >= last) return -1;
		if (val < arr[midle]) {
			return binarySearch(arr, val, 0, midle);
		} else if (val > arr[midle]) {
			return binarySearch(arr, val, midle+1, last);
		}
		else return 1;
		
	}
	public static void main (String[] args) {
		String str = scanner.nextLine();
		int testCaseNum = Integer.valueOf(str.trim());
		for (int i = 0 ; i< testCaseNum; i++) {
			str = scanner.nextLine();
			String [] strs = str.split(" ");
			int arrSize = Integer.valueOf(strs[0].trim());
			int searchVal = Integer.valueOf(strs[1].trim());
			int [] arr = new int[arrSize];
			str = scanner.nextLine();
			strs = str.split(" ");
			for (int l =0 ; l< arrSize; l++) {
				int v = Integer.valueOf(strs[l].trim());
				arr[l]=v;
			}
			int index = binarySearch(arr,searchVal, 0, arrSize);
			System.out.println(index);
		}
	}
}