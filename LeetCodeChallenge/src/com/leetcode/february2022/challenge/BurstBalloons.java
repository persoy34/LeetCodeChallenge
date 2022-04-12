package com.leetcode.february2022.challenge;

import java.util.Arrays;

public class BurstBalloons {

	public int maxCoins(int[] nums) {
     int [][] dp = new int [nums.length][nums.length];
     for (int [] dps: dp) {
    	 Arrays.fill(dps, -1);
     }
     return dp(dp, nums, 0, nums.length-1);
     
     
	}
	
	private int dp(int [][] dp, int [] nums,int left, int right) {
		if(left >right ) return 0;
        if(dp[left][right]!=-1) return dp[left][right];
        int ans=0;
        for(int i=left;i<=right;i++){
            ans=Math.max(ans,nums[i]*((left-1>=0)?nums[left-1]:1)*((right+1<nums.length)?nums[right+1]:1)+
            		dp(dp, nums,left,i-1)+dp(dp, nums,i+1,right));
        }
        return dp[left][right]=ans;
	}

	public static void main(String[] args) {
		int [] nums = {3,1,5,8};
		BurstBalloons balloons = new BurstBalloons();
		int result = balloons.maxCoins(nums);
		System.out.println(result);

	}

}
