package com.leetcode.april2022.challenge;

import java.util.PriorityQueue;

public class MaximizeSumOfArrayAfterKNegations {

	public int largestSumAfterKNegations(int[] nums, int k) {
			int total=0;
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for (int i=0; i< nums.length; i++) {
				pq.add(nums[i]);
			}
			while (k > 0) {
				int val = pq.poll();
				pq.add(val * -1);
				k--;
			}
			while (!pq.isEmpty()) {
				total+=pq.poll();
			}
			return total;
			
	}

	public static void main(String[] args) {
		//[2,-3,-1,5,-4]
		int [] nums = {2,-3,-1,5,-4};
		int k = 2;
		MaximizeSumOfArrayAfterKNegations maximizeSumOfArrayAfterKNegations = new MaximizeSumOfArrayAfterKNegations();
		int total = maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(nums, k);
		System.out.println(total);

	}

}
