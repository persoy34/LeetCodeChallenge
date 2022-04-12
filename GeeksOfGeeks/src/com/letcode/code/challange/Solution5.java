package com.letcode.code.challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Solution5 {
	public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    } 
	
	public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>>  map = new HashMap<>();
       List<List<String>> results = new ArrayList<>();
       for (String str : strs) {
    	  String temp = sortString(str);
    	  List<String> list = null;
    	  if (map.get(temp) == null) {
    		  list = new ArrayList<>();
    	  }
    	  else {
    		  list = map.get(temp);
    	  }
    	  list.add(str);
		  map.put(temp, list);
       }
      
       map.entrySet().stream().forEach(entry ->{ 
     	  results.add(entry.getValue());
        });
        results.sort(new Comparator<List>() {
    	   @Override
    	    public int compare(List o1, List o2) {
    	        if( o1.size() > o2.size()) {
    	        	return 1;
    	        }
    	        if (o1.size() == o2.size()) {
    	        	return 0;
    	        }
    	        return -1;
    	    }
	});
        results.stream().forEach(list -> {
        	Collections.sort(list);
        });
        return results;
    }

	public static void main(String[] args) {
		 String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Solution5 solution5 = new Solution5();
		List<List<String>> results =  solution5.groupAnagrams(strs);
		results.stream().forEach(value -> {
			for (String str: value)
				System.out.println(str);
		});
		
	}

}
