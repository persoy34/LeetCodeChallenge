package com.leetcode.march2022.challenge;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
	public static boolean areOccurrencesEqual(String s) {
		Map<Character,Integer> charsMap = new HashMap<>();
		for (char c: s.toCharArray()) {
			charsMap.put (c, charsMap.getOrDefault(c, 0)+1);
		}
		int commonVal=0;
		for (int i:charsMap.values()) {
			if (commonVal == 0)
				commonVal =i;
			else if (commonVal != i) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "aaaeee";
		boolean result = areOccurrencesEqual(s);
		System.out.println(result);
		

	}

}
