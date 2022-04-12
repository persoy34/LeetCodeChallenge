package com.leetcode.october.challange;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
		Queue<Integer> timeStamp;

	    public RecentCounter() {
	    	timeStamp = new LinkedList<>();
	    }
	    
	    public int ping(int t) {
	    	timeStamp.offer(t);
	        
	        while(timeStamp.peek() < (t - 3000)){
	            timeStamp.poll();
	        }
	        
	       return timeStamp.size(); 
	        
	    }

}
