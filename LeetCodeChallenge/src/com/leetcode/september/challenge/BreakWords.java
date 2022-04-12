package com.leetcode.september.challenge;

import java.util.ArrayList;
import java.util.List;

public class BreakWords {
	
	public boolean wordBreak(String s, List<String> wordDict) {
        boolean result= true;
        int index =0;
        
         while (s.length() > 0 && index < wordDict.size()) {
        	 String word = wordDict.get(index++);
        	 if (s.contains(word)) {
        		 s = s.replace(word, "");
        	 }
        	 else result = false;
         }
        return result;
        
    }

	public static void main(String[] args) {
		String s = "catsandog";
		List<String> wordDict = new ArrayList<String>();
		
		wordDict.add("cats");
		wordDict.add( "dog");
		wordDict.add("sand");
		wordDict.add("and");
		wordDict.add("cat");
		BreakWords breakWords = new BreakWords();
		boolean result = breakWords.wordBreak(s, wordDict);
		System.out.println(result);
	}

}
