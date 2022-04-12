package com.leetcode.february2022.challenge;

import java.util.Arrays;

public class AssignCookies {
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int countOfcc=0;
		int i=g.length-1;
		int j =s.length-1;
		while (i >=0 && j>=0) {
			if (s[j] >= g[i]) {
				countOfcc++;
				j--;
				i--;
			} else {
				i--;
			}
		}
		
		return countOfcc;

	}

	public static void main(String[] args) {
		int [] g = {1,2};
		int []  s = {1,2,3};
		int result = findContentChildren(g, s);
		System.out.println(result);
	}

}
