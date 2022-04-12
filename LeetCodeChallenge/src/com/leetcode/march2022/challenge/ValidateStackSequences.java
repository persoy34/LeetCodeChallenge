package com.leetcode.march2022.challenge;

import java.util.Stack;

public class ValidateStackSequences {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack<>();
		int j=0;
		int length = pushed.length;
		for (int n: pushed) {
			stack.push(n);
			while (!stack.empty() && j<length && stack.peek()==popped[j]) {
				stack.pop();
				j++;
			}
			
		}
		if (!stack.empty()) return false;
		return true;
	}

	public static void main(String[] args) {
		int [] pushed = {1,2,3,4,5};
		int [] popped = {4,3,5,1,2};
		ValidateStackSequences validateStackSequences = new ValidateStackSequences();
		boolean result = validateStackSequences.validateStackSequences(pushed, popped);
		System.out.println(result);
		

	}

}
