package com.leetcode.march2022.challenge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TheKWeakestRowsInAMatrix {
	
	public int[] kWeakestRows(int[][] mat, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int [] result = new int[k];
        for (int i=0; i< mat.length; i++) {
        	int total=0;
        	for (int j=0 ; j < mat[i].length; j++) {
        		if (mat[i][j] == 1)
        			total++;
        	}
        	map.put(i, total);
        }
        int index =0;
        final Map<Integer, Integer> sortedByCount = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (Map.Entry<Integer, Integer> mapEntry : sortedByCount.entrySet()) {
            
            result[index++] = mapEntry.getKey();
            if (index ==k) break;
        }
       return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
