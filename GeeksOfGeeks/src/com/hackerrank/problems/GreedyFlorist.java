package com.hackerrank.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GreedyFlorist {

	public int getMinimumCost(int k, int[] c) {
		Arrays.sort(c);
		Map<Integer,Integer> map = new HashMap<>();
		int sum = 0;
		// first sell most expensive flower to each person
		for (int i = c.length - 1; i >= c.length - k; i--) {
		    sum += c[i];
		}
		// current person
	    int current = 0;    
	    for (int i = c.length - k; i > 0; i--){
	      // counter how many flowers every person
	      // alredy bought
	      if (map.containsKey(current)) {
	    	 int value= map.get(current) ;
	    	 map.put(current,++value);
	      }
	      else {
	    	  map.put(current, 1);
	      }

	      // calculate sum with current price and count of
	      // flower current person already bought
	      sum += (map.get(current) + 1) * c[i - 1];

	      // move to next person
	      current++;
	      // if all persons bought same number of flowers
	      // reset current person to first
	      if (current == k) current = 0;
	    }	
		return sum;
	}
	
	public static void main(String[] args) {
		int [] c = {2, 5, 6};
		int k = 2;
		GreedyFlorist greedyFlorist = new GreedyFlorist();
		int sum = greedyFlorist.getMinimumCost(k, c);
		System.out.println("Sum: "+sum);

	}

}
