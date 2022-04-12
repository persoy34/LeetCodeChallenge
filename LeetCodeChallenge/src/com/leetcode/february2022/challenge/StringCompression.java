package com.leetcode.february2022.challenge;

public class StringCompression {

	public static int compress(char[] chars) {
		int index=0;
		int i = 0;
		int j = 0;
		while (i < chars.length) {
			j = i;
			while (j < chars.length && chars[i] == chars[j]) {
				j++;
			}
			chars[index++]=chars[i];
			if (j - i > 1) {
				String count = j - i +"";
				for (char c: count.toCharArray()) {
					chars[index++]=c;
				}
			}
			i = j;

		}

		return index;
	}

	public static void main(String[] args) {
		char[] chars = { 'a','b','b','b','b','b','b','b','b','b','b','b','b' };
		int result = compress(chars);
		System.out.println(result);

	}

}
