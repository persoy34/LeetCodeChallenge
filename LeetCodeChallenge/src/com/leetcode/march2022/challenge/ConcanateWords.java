package com.leetcode.march2022.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcanateWords {
    int min= Integer.MAX_VALUE;
    Set<String> wordCache = new HashSet<>();
	public List<String> findAllConcatenatedWordsInADict(String[] words) {
		List<String> result = new ArrayList<>();
		Set<String> wordSet = new HashSet<>();
		for (String word: words) {
			if (word.length() == 0) continue;
			min = Math.min(min, word.length());
			wordSet.add(word);
		}
		for (String word:words) {
			if (canForm(word, wordSet)) {
				result.add(word);
			}
		}
		
		return result;
	}
	
	private boolean canForm(String word, Set<String> wordSet) {
		if (wordCache.contains(word)) return true;
		for (int i=min ; i <=word.length()-min; i++) {
			String left = word.substring(0,i);
			String right = word.substring(i);
			if (wordSet.contains(left)) {
				if (wordSet.contains(right) || canForm(right, wordSet)) {
					wordCache.add(word);
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String [] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
		ConcanateWords concanateWords = new ConcanateWords();
		List<String> result=concanateWords.findAllConcatenatedWordsInADict(words);
		System.out.println(result);

	}

}
