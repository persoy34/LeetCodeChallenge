package com.leetcode.march2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class RingsAndRods {

	public static int countPoints(String rings) {
		int result=0;
		if (rings==null || rings.length()==0 || Character.isDigit(rings.charAt(0)))
			return -1;
		List<Integer> redList = new ArrayList<>();
		List<Integer> blueList = new ArrayList<>();
		List<Integer> greenList = new ArrayList<>();
		for (int i=0; i<rings.length()-1; i+=2){
			char ch= rings.charAt(i);
			if ( ch =='R') {
				if (!redList.contains(rings.charAt(i+1)-'0'))
					redList.add(rings.charAt(i+1)-'0');
			} else if ( ch=='B') {
				if (!blueList.contains(rings.charAt(i+1)-'0'))
					blueList.add(rings.charAt(i+1)-'0');
			} else  {
				if (!greenList.contains(rings.charAt(i+1)-'0'))
					greenList.add(rings.charAt(i+1)-'0');
			}
		}
		// travell through longest size
		if (redList.size() >= blueList.size() && redList.size() >= greenList.size()) {
			for (int i=0; i< redList.size(); i++) {
				int rod = redList.get(i);
				if (blueList.contains(rod) && greenList.contains(rod)) {
					result++;
				}
			}
		} else if (blueList.size() >= redList.size() && blueList.size() >= greenList.size()) {
			for (int i=0; i<blueList.size(); i++) {
				int rod = blueList.get(i);
				if (redList.contains(rod) && greenList.contains(rod)) {
					result++;
				}
			}
		} else {
			for (int i=0; i<greenList.size(); i++) {
				int rod = greenList.get(i);
				if (redList.contains(rod) && blueList.contains(rod))
					result++;
			}
		}
	
		return result;
			
	}

	public static void main(String[] args) {
	 String	rings = "B0R0G0R9R0B0G0";
	 int result = countPoints(rings);
	 System.out.println(result);
	}

}
