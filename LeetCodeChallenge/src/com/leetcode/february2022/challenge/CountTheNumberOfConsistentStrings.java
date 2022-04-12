package com.leetcode.february2022.challenge;

public final class CountTheNumberOfConsistentStrings {

	public int countConsistentStrings(String allowed, String[] words) {
		int count=0;
			for (String word: words) {
				for (int i=0; i< allowed.length(); i++) {
					if (!"".equals(word) && word.length() > 0) {
						word=word.replaceAll(allowed.charAt(i)+"", "");
					} 
					if ("".equals(word)) {
						count++;
						break;
					}
				}
			}
			return count;
	}

	public static void main(String[] args) {
		String allowed = "abc";
		String [] words = {"a","b","c","ab","ac","bc","abc"};
		CountTheNumberOfConsistentStrings consistentStrings = new CountTheNumberOfConsistentStrings();
		int count = consistentStrings.countConsistentStrings(allowed, words);
		System.out.println(count);

	}

}
