package com.leetcode.february2022.challenge;

import java.util.HashMap;
import java.util.Map;

public class ReorganizeString {
	char lastUsedChar=' ';
	boolean done =false;
	public String reorganizeString(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i=0; i<s.length(); i++) {
			char ch= s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		StringBuilder builder = new StringBuilder();
	
		while (!done) {
			char mostlyUsed=getMostlyUsed( map);
			lastUsedChar=mostlyUsed;
			if (!done)
			  builder.append(mostlyUsed);
		}
		// check if there is any value in map
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if (entry.getValue() > 0)
				return "";
		}
		return builder.toString();

	}
    char getMostlyUsed(Map<Character, Integer> map) {
    	
    	char highlyUsedCh=' ';
    	int count=0;
    	for (Map.Entry<Character, Integer> entry: map.entrySet()) {
    		if (entry.getValue() >0 && entry.getKey() != lastUsedChar ) {
    			if (entry.getValue() >= count) {
    				highlyUsedCh=entry.getKey();
    				count=entry.getValue();
    			}
    		}
    		else continue;
    	}
    	
    	if (highlyUsedCh==' ')
    		done=true;
    	else {
    		map.put(highlyUsedCh, count-1);
    	}
    	return highlyUsedCh;
    }
	public static void main(String[] args) {
		String s = "aaab";
		ReorganizeString reorganizeString = new ReorganizeString();
		String result = reorganizeString.reorganizeString(s);
		System.out.println(result);

	}

}
