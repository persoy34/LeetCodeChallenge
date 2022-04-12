package com.leetcode.january2022.challenge;

import java.util.Stack;

public class LongestValidParanthesis {
	public int longestValidParentheses(String s) {
        char [] ch =s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int totalVal=0;
        stack.push(-1);
        for (int i=0; i< ch.length; i++) {
        	if (ch[i]=='(') {
        		stack.push(i);
        	} else {
                if (!stack.empty()) 
                	stack.pop();
                if (stack.empty() ) {
        		    stack.push(i);
        	    }  else {
                    totalVal=Math.max(totalVal, i-stack.peek());
                }
        }
        }
        return totalVal;
    }

	public static void main(String[] args) {
		String s ="(()";
		LongestValidParanthesis longestValidParanthesis = new LongestValidParanthesis();
		int result = longestValidParanthesis.longestValidParentheses(s);
		System.out.println(result);
	}

}
