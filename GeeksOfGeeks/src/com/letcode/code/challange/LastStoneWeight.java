package com.letcode.code.challange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {
	
	public int lastStoneWeight(int[] stones) {
       List<Integer> list = new ArrayList<>();
       for (int i=0; i<stones.length; i++) {
    	   list.add(stones[i]);
       }
       return findlastStoneWight(list);
       
	}
	private int findlastStoneWight(List<Integer> list) {
		
		int i =0;
		while (list.size() > 1 && i < list.size()) {
			Collections.sort(list,Collections.reverseOrder());
			int val_1 = list.remove(i);
			int val_2 = list.remove(i);
			
			if (val_1 - val_2 !=0) {
				 list.add(val_1 - val_2);
			}
					
		}
		if  (list.size() > 1)
			return list.get(0);
		return 0;
	}
	
	public static void main(String ...strings) {
		int [] arr = {2,7,4,1,8,1};
		LastStoneWeight lastStoneWeight = new LastStoneWeight();
		int val = lastStoneWeight.lastStoneWeight(arr);
		System.out.println("Last stone weight: "+val);
	}
}
