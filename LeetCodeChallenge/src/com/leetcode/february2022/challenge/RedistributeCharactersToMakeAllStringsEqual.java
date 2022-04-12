package com.leetcode.february2022.challenge;

public class RedistributeCharactersToMakeAllStringsEqual {

	public boolean makeEqual(String[] words) {
		int [] chars = new int [26];
		for (String word : words) {
			for (char ch: word.toCharArray()) {
				chars[ch - 'a']++;
			}
		}
		for (int i=0; i< 26; i++) {
			if (chars[i] == 0)
				continue;
			if (chars[i] % words.length != 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		String [] words = {"ab","a"};
		RedistributeCharactersToMakeAllStringsEqual allStringsEqual = 
				new RedistributeCharactersToMakeAllStringsEqual();
		boolean result = allStringsEqual.makeEqual(words);
		System.out.println(result);
	}

}
