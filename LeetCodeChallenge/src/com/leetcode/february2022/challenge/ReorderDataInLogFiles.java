package com.leetcode.february2022.challenge;

import java.util.Arrays;

public class ReorderDataInLogFiles {
	public static String[] reorderLogFiles(String[] logs) {
		if (logs == null || logs.length <2)
			return logs;
		Arrays.sort(logs,(log1, log2) -> {
			// log1 < log2 --> -1
			// log1 == log2 --> 0
			// log1 > log2 --> 1
			int index = log1.indexOf(" ");
		    String id1 = log1.substring(0, index);
		    String main1 = log1.substring(index+1);
		    index = log2.indexOf(" ");
		    String id2 = log2.substring(0, index);
		    String main2 = log2.substring(index+1);
		    Boolean isDigit1 = Character.isDigit(main1.charAt(0));
		    Boolean isDigit2 = Character.isDigit(main2.charAt(0));
		    if (!isDigit1 && !isDigit2) {
		    	int val = main1.compareTo(main2);
		    	if (val==0)
		    		 return id1.compareTo(id2);
		    	return val;
		    }
		    return isDigit1 ? (isDigit2 ? 0 : 1) :-1;
		    
		});
		return logs;
	}

	public static void main(String[] args) {
		String [] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		logs = reorderLogFiles(logs);
		System.out.println(Arrays.toString(logs));
	}

}
