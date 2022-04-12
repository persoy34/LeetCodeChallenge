package com.leetcode.april2022.challenge;

public class CheckIfStringIsAPrefixOfArray {

	public boolean isPrefixString(String s, String[] words) {
		int i=0;
		int j=0;
		while (j < s.length() && i<words.length) {
			String word= words[i];
			for (char w:word.toCharArray()) {
				if (j<s.length()&& s.charAt(j)==w) {
					j++;
				} else {
					return false;
				}
			}
			i++;
		}
		if (j < s.length()) return false;
		return true;
	}

	public static void main(String[] args) {
		//"a"
		//["a","ad","cookie"]
		String s = "iloveleetcode";
		String [] words = {"i","love","leetcode","apples"};
		CheckIfStringIsAPrefixOfArray aPrefixOfArray = new CheckIfStringIsAPrefixOfArray();
		boolean result = aPrefixOfArray.isPrefixString(s,words);
		System.out.println(result);

	}

}
