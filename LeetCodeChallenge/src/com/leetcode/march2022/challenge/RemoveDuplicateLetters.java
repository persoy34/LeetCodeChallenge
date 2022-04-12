package com.leetcode.march2022.challenge;

import java.util.Stack;

public class RemoveDuplicateLetters {

	public String removeDuplicateLetters(String s) {
		Stack<Character> stack = new Stack<>();
		StringBuilder builder = new StringBuilder();
		int[] characters = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (stack.isEmpty()) {
				stack.push(ch);
				characters[ch - 'a'] = i;
			} else if (stack.peek() <= ch) {
				if (!stack.contains(ch)) {
					stack.push(ch);
					characters[ch - 'a'] = i;
				}
			} else {
				if (!stack.contains(ch)) {
					boolean isDone = false;
					while (!stack.empty() && !isDone) {
						if (stack.isEmpty())
							break;
						char peeked = stack.peek();
						if (peeked < ch)
							isDone = true;
						else {
							if (characterExist(peeked, i, s)) {
								char popped = stack.pop();
								characters[popped - 'a'] = 0;
							} else {
								break;
							}
						}
					}
					stack.push(ch);
					characters[ch - 'a'] = i;
				}
			}
		}
		while (!stack.empty()) {
			builder.append(stack.pop());
		}
		return builder.reverse().toString();
	}

	private boolean characterExist(char peeked, int index, String s) {
		if (s.lastIndexOf(peeked) > index)
			return true;
		return false;
	}

	public static void main(String[] args) {
		String s = "bbcaac";
		RemoveDuplicateLetters duplicateLetters = new RemoveDuplicateLetters();
		String result = duplicateLetters.removeDuplicateLetters(s);
		System.out.println(result);

	}

}
