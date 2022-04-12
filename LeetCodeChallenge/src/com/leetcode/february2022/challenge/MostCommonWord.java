package com.leetcode.february2022.challenge;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

	public String mostCommonWord(String paragraph, String[] banned) {
			Set<String> bannedSet = new HashSet<>();
			for (String ban: banned) {
				bannedSet.add(ban);
			}
			
			String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
			Map<String, Integer> wordMap = new HashMap<>();
			for (String word: words) {
				int count=0;
				if (!bannedSet.contains(word)) {
					count= wordMap.getOrDefault(word, 0);
					wordMap.put(word, ++count);
				}
			}
			return Collections.max(wordMap.entrySet(), Map.Entry.comparingByValue()).getKey();
			
	}

	public static void main(String[] args) {
		String paragraph = "abc abc? abcd the jeff!";
		String []banned = {"abc","abcd","jeff"};
		MostCommonWord commonWord = new MostCommonWord();
		String result = commonWord.mostCommonWord(paragraph, banned);
		System.out.println(result);
		

	}

}
