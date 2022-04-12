package com.leetcode.february2022.challenge;

import java.util.Arrays;

public class BagOfTokens {

	public int bagOfTokensScore(int[] tokens, int power) {
		Arrays.sort(tokens);
		int start =0;
		int end =tokens.length-1;
		int point =0;
		int maxToken=0;
		while (start <= end) {
			if (power >= tokens[start]) {
				power -=tokens[start++];
				point++;
				maxToken = Math.max(maxToken, point);
			} else if (point > 0) {
				power+=tokens[end--];
				point--;
			} else {
				return maxToken;
			}
		}
		return maxToken;

	}

	public static void main(String[] args) {
		int [] tokens = {100,200};
		int  power = 150;
		BagOfTokens bagOfTokens = new BagOfTokens();
		int result = bagOfTokens.bagOfTokensScore(tokens, power);
		System.out.println(result);

	}

}
