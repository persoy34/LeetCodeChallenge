package com.leetcode.october.challange;

public class InterleavingString {

    
	public static boolean isInterleave(String s1, String s2, String s3) {

		 int m = s1.length();
		 int n = s2.length();
		 if(m+n!=s3.length()) {
			 return false;
		 }
		 Boolean[][] dp=new Boolean[m+1][n+1];
		
		 return check(s1,s2,s3,dp,m,n,s3.length());
	}


	private static boolean check(String s1, String s2, String s3, Boolean[][] dp, int i,int j,int k) {
		if(i==0 && j==0 && k==0) {
			return true;
		}
		if(k==0 &&(i!=0 || j!=0)) {return false;}
		if(k!=0 &&(i==0 && j==0)) {return false;}
		
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		if(i!=0 && j!=0 && s1.charAt(i-1)==s3.charAt(k-1) && s2.charAt(j-1)==s3.charAt(k-1) ) {
			return dp[i][j]=check(s1, s2, s3, dp, i-1, j, k-1) || check(s1, s2, s3, dp, i, j-1, k-1);
		}
		else if(i!=0 && s1.charAt(i-1)==s3.charAt(k-1)) {
			return dp[i][j]=check(s1, s2, s3, dp, i-1, j, k-1);
		}
		else if(j!=0 && s2.charAt(j-1)==s3.charAt(k-1)) {
			return dp[i][j]=check(s1, s2, s3, dp, i, j-1, k-1);
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		InterleavingString interleavingString = new InterleavingString();
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
	    boolean result = interleavingString.isInterleave(s1, s2, s3);
	    System.out.println(result);

	}

}
