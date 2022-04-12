package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {

	public List<String> findRepeatedDnaSequences(String s) {
		List<String> result = new ArrayList<>();
		Map <String, Integer> dnaMap = new HashMap<>();
		
		int i=0;
		while (i + 10 <= s.length()) {
			String dnaSequence = s.substring(i, i+10);
			dnaMap.put(dnaSequence, dnaMap.getOrDefault(dnaSequence, 0)+1);
			if (dnaMap.get(dnaSequence) == 2) {
				result.add(dnaSequence);
			}
			i++;
		}
		return result;

	}

	public static void main(String[] args) {
		String	s = "AAAAAAAAAAA";
		RepeatedDNASequences dnaSequences = new RepeatedDNASequences();
		List<String> result = dnaSequences.findRepeatedDnaSequences(s);
		System.out.println(result);

	}

}
