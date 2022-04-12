package com.leetcode.april2022.challenge;


public class ValidPalindromeII {

	public boolean validPalindrome(String s) {
	       int i=0;
			int j = s.length()-1;
			while (i < j) {
				if (s.charAt(i)== s.charAt(j)) {
					i++;
					j--;
				} else {
	               if( checkPalidrome(i, j-1, s)) {
	            		 return true;
	               } else if (checkPalidrome(i+1, j,s)) {
	            	   return true;
	               } else
	                  return false;
	               
	            }
			}
			return true; 
	    }
	    
	    private boolean checkPalidrome(int i, int j, String s){
	        while (i<j){
	            if (s.charAt(i)!= s.charAt(j)) {
					return false;
				} 
	            i++;
	            j--;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ebcbbececabbacecbbcbe";
		ValidPalindromeII palindromeII = new ValidPalindromeII();
		boolean result= palindromeII.validPalindrome(s);
		System.out.println(result);
		
	}

}
