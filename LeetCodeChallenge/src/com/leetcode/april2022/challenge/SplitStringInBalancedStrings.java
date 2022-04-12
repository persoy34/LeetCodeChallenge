package com.leetcode.april2022.challenge;

public class SplitStringInBalancedStrings {

	public int balancedStringSplit(String s) {
		int count=0;
		int Lcount=0;
		for (char c : s.toCharArray()) {
			if (c=='L')
				Lcount++;
			else if (c=='R')
				Lcount--;
			if (Lcount ==0)
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		String s = "RLLLLRRRLR";
		SplitStringInBalancedStrings balancedStrings = new SplitStringInBalancedStrings();
		int result = balancedStrings.balancedStringSplit(s);
		System.out.println(result);

	}

}
