package com.leetcode.january2022.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {

	boolean check(String s, Map<String, Integer> map, int ws) {
		int i = 0;
		int j = ws;
		while (j <= s.length() && i < s.length()) {
			String sub = s.substring(i, j);
			// System.out.print(sub+" ");
			if (map.containsKey(sub) && map.get(sub) > 0) {
				map.put(sub, map.get(sub) - 1);
				i = j;
				j = j + ws;

			} else {
				return false;
			}
		}
		return true;
	}

	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> ans = new ArrayList<>();
		int i = 0;
		int size = words[0].length();
		int j = size * words.length;
		int sz = j;
		Map<String, Integer> map = new HashMap<>();

		map=fillMap(map, words);
		while (j <= s.length() && i < s.length()) {
			// System.out.print(s.substring(i,j)+"::");
			if (check(s.substring(i, j), map, size)) {
				ans.add(i);
				i = i + 1;
				j = i + sz;
			} else {
				i++;
				j++;
			}
			map.clear();
			map=fillMap(map, words);
		}
		// System.out.print(s.substring(j));
		return ans;
	}

	private Map<String,Integer> fillMap(Map<String, Integer> map, String[] words){
		for (int k = 0; k < words.length; k++) {
			if (map.containsKey(words[k])) {
				map.put(words[k], map.get(words[k]) + 1);
			} else {
				map.put(words[k], 1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		String s = "barfoothefoobarman";
		String [] words = {"foo","bar"};
		SubstringWithConcatenationOfAllWords concatenationOfAllWords = new SubstringWithConcatenationOfAllWords();
		List<Integer> results= concatenationOfAllWords.findSubstring(s, words);
		for (int result : results) {
			System.out.println(result);
		}

	}

}
