package com.leetcode.february2022.challenge;


public class ReverseOnlyLetters {

	public static String reverseOnlyLetters(String s) {
		int length = s.length()-1;
		int end=length;
		int start =0;
		char [] charArr = s.toCharArray();
		while (start < end) {
			while (start < end && !Character.isAlphabetic(s.charAt(start))){
				start++;
			} 
			while (end > start &&!Character.isAlphabetic(s.charAt(end))) {
				end--;
			}
			charArr[end]=s.charAt(start);
			charArr[start]=s.charAt(end);
			start++;
			end--;
			
		}
		return new String(charArr);
	}

	public static void main(String[] args) {
		//"dDR.D6YI"
		//dDR.D6YI
		String s = "Test1ng-Leet=code-Q!";
		String result = reverseOnlyLetters(s);
		System.out.println(result);

	}

}
