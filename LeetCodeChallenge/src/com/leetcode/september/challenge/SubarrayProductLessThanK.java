package com.leetcode.september.challenge;

public class SubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		 if (k <= 1) return 0; // nums = [1], k = 1
	        int count = 0;
	        int left = 0;
	        int prod = 1;
	        for (int i = 0; i < nums.length; i++) {
	            prod *= nums[i];
	            while (prod >= k) {
	                prod /= nums[left++];
	            }
	            count += i - left + 1;
	        }
	        return count;
	}

	public static void main(String... string) {
		int [] nums = {10, 5, 2, 6};
		int k =100;
		SubarrayProductLessThanK productLessThanK = new SubarrayProductLessThanK();
		int result = productLessThanK.numSubarrayProductLessThanK(nums, k);
		System.out.println(result);
	}
}
