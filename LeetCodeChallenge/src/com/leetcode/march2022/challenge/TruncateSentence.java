package com.leetcode.march2022.challenge;

public class TruncateSentence {
	public static String truncateSentence(String s, int k) {
		StringBuilder builder = new StringBuilder();
		int count=0;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)==' ') {
				count++; 
			}
			if (count == k) break;
			builder.append(s.charAt(i));
		}
		return builder.toString();

	}

	public static void main(String[] args) {
		String s = "What is the solution to this problem";
		int k = 4;
		String result = truncateSentence(s, k);
		System.out.println(result);

	}

}
