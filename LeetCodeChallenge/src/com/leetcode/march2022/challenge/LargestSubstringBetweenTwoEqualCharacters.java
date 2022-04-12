package com.leetcode.march2022.challenge;

public class LargestSubstringBetweenTwoEqualCharacters {

	public int maxLengthBetweenEqualCharacters(String s) {
		int index=0;
		int i=0;
		int result =-1;
		for (i=0; i< s.length(); i++) {
			char ch =s.charAt(i);
			index =s.lastIndexOf(ch);
			result = Math.max(result, Math.abs(i-index)-1);
			
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		String s = "abca";
		LargestSubstringBetweenTwoEqualCharacters betweenTwoEqualCharacters = new LargestSubstringBetweenTwoEqualCharacters();
		int result = betweenTwoEqualCharacters.maxLengthBetweenEqualCharacters(s);
		System.out.println(result);
	}

}
