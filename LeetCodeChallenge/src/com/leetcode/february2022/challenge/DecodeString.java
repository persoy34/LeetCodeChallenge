package com.leetcode.february2022.challenge;

import java.util.Stack;


public class DecodeString {
	private static char OPEN_BRAKET = '[';
	private static char CLOSE_BRAKET = ']';
	
	public static String decodeString(String s) {
		Stack<String> words = new Stack<>();
		Stack<Integer> number = new Stack<>();
		StringBuilder builder = new StringBuilder();
		int tempNumber =0;
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == OPEN_BRAKET ) {
				// push number value to stack
				number.push(tempNumber);
				// set tempNumber to zeror
				tempNumber =0;
				words.push(builder.toString());
				builder = new StringBuilder();
			} else if (Character.isDigit(ch)) {
					tempNumber=tempNumber*10+ (ch -'0');
				
			} else if (Character.isAlphabetic(ch)) {
				builder.append(ch);
			} else  if (ch == CLOSE_BRAKET) {
				StringBuilder encodeBuilder = new StringBuilder(words.pop());
				tempNumber = number.pop();
				
				for (int j=0; j< tempNumber; j++) {
					encodeBuilder.append(builder);
				}
				builder=encodeBuilder;
				tempNumber=0;
				
			}
		}
		return builder.toString();

	}

	public static void main(String[] args) {
		String s = "2[abc]3[cd]ef";
		String result = decodeString(s);
		System.out.println(result);
	}

}
