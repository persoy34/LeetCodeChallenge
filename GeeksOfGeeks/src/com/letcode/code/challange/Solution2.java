package com.letcode.code.challange;

public class Solution2 {

	public int maxSubArray(int[] nums) {
		  
	    int n = nums.length;
	    int maximumSubArraySum = Integer.MIN_VALUE;

	    for (int left = 0; left < n; left++) {
	  
	        int runningWindowSum = 0;
	  
	        for (int right = left; right < n; right++) {
	            runningWindowSum += nums[right];
	  
	            if (runningWindowSum > maximumSubArraySum) {
	                maximumSubArraySum = runningWindowSum;
	            }
	        }
	    }
	    return maximumSubArraySum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		Solution2 solution2 = new Solution2();
		int value = solution2.maxSubArray(nums);
		System.out.println(" Value: "+value);
	}

}
