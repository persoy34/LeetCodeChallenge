package com.leetcode.january2022.challenge;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeByConcatenatingTwoLetterWords {
	public int longestPalindrome(String[] words) {
		int  count=0;
		Map<String, Integer> differentWords = new HashMap<>();
		Map<String, Integer> sameWords = new HashMap<>();
		for (String word: words) {
			if (word.charAt(0)==word.charAt(1)) {
				sameWords.put(word, sameWords.getOrDefault(word, 0)+1);
			} else {
				differentWords.put(word, differentWords.getOrDefault(word, 0)+1);
			}
		}
		for (Map.Entry<String, Integer> entry: differentWords.entrySet()) {
			String key =entry.getKey();
			int val = entry.getValue();
			if (val ==0) continue;
			String reverseKey = (key.charAt(1)+""+ key.charAt(0)+"");
			if (!differentWords.containsKey(reverseKey))
				continue;
			
			int reverseVal = differentWords.get(reverseKey);
			int addVal = Math.min(val, reverseVal);
			count+=(addVal*4);
			//we no longer use this key, because we already added to the string
			differentWords.put(reverseKey, 0);
			
		}
		boolean left=false;
		for (Map.Entry<String, Integer> entry: sameWords.entrySet()) {
			int val=entry.getValue();
			if (val %2 !=0) {
				count +=(val*2)-2;
				left=true;
			} else {
				count+=(val*2);
			}
		}
		if (left ) {
			count+=2;
		}
		return count;
	}

	public static void main(String[] args) {
		String [] words = {"ab","ty","yt","lc","cl","ab"};
		LongestPalindromeByConcatenatingTwoLetterWords byConcatenatingTwoLetterWords = new LongestPalindromeByConcatenatingTwoLetterWords();
		int result = byConcatenatingTwoLetterWords.longestPalindrome(words);
		System.out.println(result);

	}

}
