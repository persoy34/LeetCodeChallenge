package com.letcode.practice;

public class Solution {
	 private static int[] twoSum(int[] nums, int target) {
	        int [] index = new int [2];
	        for (int i = 0; i < nums.length-1 ; i++){
	            for (int j = 1; j < nums.length ; j++){
	                if (nums[i]+nums[j] == target && i != j){
	                    index[0]=i;
	                    index[1]=j;
	                    break;
	                }
	            }
	        }
	        return index;
   }
	public static void main(String[] args) {
		int [] nums = {-1,-2,-3,-4,-5};
		int target=	-8;
		int [] index = twoSum(nums, target);
		System.out.println(index[0]+" "+index[1]);

	}

}
