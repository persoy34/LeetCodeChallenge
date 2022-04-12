package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

	public List<Integer> partitionLabels(String S) {
		List<Integer> result = new ArrayList<>();
		int [] lastIndexes = new int [26];
		for (int i=0; i<S.length(); i++) {
			lastIndexes[S.charAt(i)-'a']= i;
		}
		int i=0;
		while (i<S.length()) {
			int end = lastIndexes[S.charAt(i)-'a'];
			int j=i+1;
			while(j != end) {
				end =Math.max(end, lastIndexes[S.charAt(j++)-'a']);
				
			}
			result.add(j-i+1);
			i=j+1;
		}
		
		return result;
	}

	public static void main(String[] args) {
		String s = "ababcbacadefegdehijhklij";
		PartitionLabels partitionLabels = new PartitionLabels();
		List <Integer> result = partitionLabels.partitionLabels(s);
		System.out.println(result);
	}

}
