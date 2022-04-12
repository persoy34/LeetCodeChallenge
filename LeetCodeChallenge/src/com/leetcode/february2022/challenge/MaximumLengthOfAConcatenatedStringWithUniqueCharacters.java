package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
	int result =0;
	public int maxLength(List<String> arr) {
		
		findUniqueMaxCharacter(arr,0, "");
		return result;
	}
	
	private void findUniqueMaxCharacter(List<String>arr,int index, String current) {
		if (index == arr.size()) {
			if (isUnique(current) > result) {
				result= current.length();
			}
			return;
		}
		
		findUniqueMaxCharacter(arr, index+1, current);
		findUniqueMaxCharacter(arr, index+1, current+arr.get(index));
		
	}
	
	private int isUnique(String current) {
		char [] chars = new char [26];
		for (char c: current.toCharArray()) {
			if (chars[c-'a']++ > 0) {
				return -1;
			}
		}
		return current.length();
	}

	public static void main(String[] args) {
		MaximumLengthOfAConcatenatedStringWithUniqueCharacters characters = 
				new MaximumLengthOfAConcatenatedStringWithUniqueCharacters();
		List<String> arrs = new ArrayList<>();
		// "cha","r","act","ers"
		arrs.add("cha");
		arrs.add("r");
		arrs.add("act");
		arrs.add("ers");
		int result = characters.maxLength(arrs);
		System.out.println(result);

	}

}
