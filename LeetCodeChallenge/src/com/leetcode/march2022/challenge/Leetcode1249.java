package com.leetcode.march2022.challenge;

public class Leetcode1249 {

	public static String minRemoveToMakeValid(String s) {
		StringBuilder builder = new StringBuilder();
		int open =0;
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				open++;
			} else if (ch ==')') {
				if (open == 0) continue;
				open--;
			}
			builder.append(ch);
		}
		if (open > 0) {
			int i=builder.length()-1;
			while (open > 0) {
				if (builder.charAt(i) == '(') {
					builder.replace(i, i+1, "");
					open--;
					i--;
				} else {
					i--;
				}
				if (open ==0) break;
			}
		}
		return builder.toString();

	}

	public static void main(String[] args) {
		String s = "(a(b(c)d)";
		String result = minRemoveToMakeValid(s);
		System.out.println(result);

	}

}
