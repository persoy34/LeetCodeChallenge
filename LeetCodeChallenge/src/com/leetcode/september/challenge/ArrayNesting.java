package com.leetcode.september.challenge;

public class ArrayNesting {
	
	public int arrayNesting(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                int start = nums[i], count = 0;
                while (nums[start] != Integer.MAX_VALUE) {
                    int temp = start;
                    start = nums[start];
                    count++;
                    nums[temp] = Integer.MAX_VALUE;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
	
	public static void main(String ...strings) {
		int [] nums = {5,4,0,3,1,6,2};
		
		ArrayNesting arrayNesting = new ArrayNesting();
		int result = arrayNesting.arrayNesting(nums);
		System.out.println(result);
	}
}
