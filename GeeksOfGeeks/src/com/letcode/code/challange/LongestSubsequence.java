package com.letcode.code.challange;

public class LongestSubsequence {
	
	/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
	  int lcs( char[] X, char[] Y, int m, int n ) 
	  { 
	    int L[][] = new int[m+1][n+1]; 
	  
	    /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
	         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
	    for (int i=0; i<=m; i++) 
	    { 
	      for (int j=0; j<=n; j++) 
	      { 
	        if (i == 0 || j == 0) 
	            L[i][j] = 0; 
	        else if (X[i-1] == Y[j-1]) 
	            L[i][j] = L[i-1][j-1] + 1; 
	        else
	            L[i][j] = max(L[i-1][j], L[i][j-1]); 
	      } 
	    } 
	  return L[m][n]; 
	  } 
	  
	  /* Utility function to get max of 2 integers */
	  int max(int a, int b) 
	  { 
	    return (a > b)? a : b; 
	  } 
	   
	
	public  int longestCommonSubsequence(String text1, String text2) {
      char [] X = text1.toCharArray();
      int m =text1.length();
      char [] Y = text2.toCharArray();
      int n = text2.length();
      int longest = lcs(X,Y,m,n);
      return longest;
    }
	
	
	public static void main(String[] args) {
		
		LongestSubsequence longestSubsequence = new LongestSubsequence();
		String text1 ="ylqpejqbalahwr", text2 = "yrkzavgdmdgtqpg" ;
		int longest= longestSubsequence.longestCommonSubsequence(text1, text2);
		System.out.println("longestCommonSubsequence :"+longest);
	}

}
