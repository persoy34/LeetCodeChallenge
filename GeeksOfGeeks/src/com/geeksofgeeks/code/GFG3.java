package com.geeksofgeeks.code;

import java.util.*;

class GFG3 {
	private static Scanner scanner = new Scanner(System.in);
	static void printTwoElements(int arr[], int size) 
    { 
        int i; 
        for (i = 0; i < size; i++) { 
            int abs_val = Math.abs(arr[i]); 
            if (arr[abs_val - 1] > 0) 
                arr[abs_val - 1] = -arr[abs_val - 1]; 
            else
                System.out.print(abs_val+" "); 
        } 
        for (i = 0; i < size; i++) { 
            if (arr[i] > 0) 
                System.out.println(i + 1); 
        } 
    } 
	public static void main (String[] args) {
		String str = scanner.nextLine();
		int testCaseNum = Integer.valueOf(str.trim());
		for (int i=0; i<testCaseNum; i++) {
			str = scanner.nextLine();
			int number = Integer.valueOf(str.trim());
			int [] intArr = new int[number];
			str = scanner.nextLine();
			String [] strArr = str.split(" ");
			for (int j = 0; j < number; j++) {
				intArr[j]= Integer.valueOf(strArr[j].trim());
			}
			printTwoElements(intArr, number);
		}
	}
}