package com.leetcode.february2022.challenge;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
	public static int isPrefixOfWord(String sentence, String searchWord) {
		String [] words = sentence.split(" ");
		for (int i=0; i<words.length; i++) {
			if ((words[i].length() >= searchWord.length()) && (words[i].startsWith(searchWord)))
				return i+1;
		}
		return -1;

	}

	public static void main(String[] args) {
	 String	sentence = "i love eating burger";
	 String searchWord = "burg";
	 int result = isPrefixOfWord(sentence, searchWord);
	 System.out.println(result);

	}

}
