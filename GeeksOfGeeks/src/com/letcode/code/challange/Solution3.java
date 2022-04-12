package com.letcode.code.challange;

import java.util.Arrays;


public class Solution3 {
	public void moveZeroes(int[] arr) {
		Arrays.sort(arr);
		int count = 0;  // Count of non-zero elements 
		  
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; // here count is 
                                       // incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < arr.length) 
            arr[count++] = 0; 
        for (int i: arr) {
        	System.out.print(i+" ");
        }
        System.out.println();
	}
	
	public static void main(String ...strings) {
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		Solution3 solution3 = new Solution3();
		solution3.moveZeroes(arr);
	}

}
