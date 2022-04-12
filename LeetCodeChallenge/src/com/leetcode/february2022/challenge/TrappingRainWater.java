package com.leetcode.february2022.challenge;

public class TrappingRainWater {

	public int trap(int[] height) {
		if (height == null || height.length == 0)
			return 0;
		int left =0, right = height.length-1;
		int leftMax = height[left];
		int rightMax = height[right];
		int result = 0;
		
		while (left < right) {
			if (leftMax < rightMax) {
				left++;
				leftMax = Math.max(leftMax, height[left]);
				result+= leftMax - height[left];
			} else {
				right--;
				rightMax = Math.max(rightMax, height[right]);
				result += rightMax - height[right];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		TrappingRainWater rainWater = new TrappingRainWater();
		int result = rainWater.trap(height);
		System.out.println(result);

	}

}
