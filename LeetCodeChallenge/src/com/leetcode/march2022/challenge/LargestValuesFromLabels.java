package com.leetcode.march2022.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class LargestValuesFromLabels {
	public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        List<Item> items = new ArrayList<>();
        for (int i=0; i< values.length; i++){
            items.add(new Item(values[i], labels[i]));
        }
        PriorityQueue<Item> maxHeap = new PriorityQueue<>((Item a, Item b) -> b.value-a.value);
        maxHeap.addAll(items);
        Map<Integer,Integer> map = new HashMap<>();
        int returnVal = 0;
        while (!maxHeap.isEmpty() && numWanted > 0){
            Item item=maxHeap.remove();
            map.put(item.label, map.getOrDefault(item.label, 0)+1);
            if (map.get(item.label) <= useLimit){
                returnVal+=item.value;
                numWanted--;
            }
        }
        return returnVal;
    }
    
    class Item {
        int value;
        int label;
        Item (int value, int label){
            this.value = value;
            this.label = label;
        }
            
    }

	public static void main(String[] args) {
		int [] values = {5,4,3,2,1};
		int [] labels = {1,1,2,2,3};
		int numWanted = 3, useLimit = 1;
		LargestValuesFromLabels fromLabels = new LargestValuesFromLabels();
		int result = fromLabels.largestValsFromLabels(values, labels, numWanted, useLimit);
		System.out.println(result);

	}

}
