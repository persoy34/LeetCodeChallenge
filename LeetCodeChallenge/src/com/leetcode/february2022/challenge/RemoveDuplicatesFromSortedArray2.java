package com.leetcode.february2022.challenge;

public class RemoveDuplicatesFromSortedArray2 {
	
	 public static int removeDuplicates(int[] nums) {
		 if (nums.length < 3)
			 return nums.length;
	        int slow=2;
	        for(int fast=slow; fast < nums.length; fast++) {
	        	if (nums[fast] != nums[slow-2]) {
	        		nums[slow++]= nums[fast];
	        	}
	        }
	        return slow;
	       
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] nums= {0,0,1,1,1,2,3,3,3};
       int result = removeDuplicates(nums);
       System.out.println(result);
	}

}
