package com.leetcode.february2022.challenge;

public class UniquePaths {
	
	 public static int uniquePaths(int m, int n) {
		 int [][] dp = new int [m][n];
		 for (int i=0; i<m; i++) {
			 for (int j=0; j<n; j++) {
				 if (i==0 || j==0)
					 dp[i][j]=1;
				 else {
					 dp[i][j]=dp[i-1][j] +dp[i][j-1];
				 }
			 }
		 }
		 return dp[m-1][n-1];
	 }

	public static void main(String[] args) {
		int m = 3, n = 7;
		int result = uniquePaths(m, n);
		System.out.println(result);

	}

}
