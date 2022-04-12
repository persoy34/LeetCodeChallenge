package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	
    public static List<String> summaryRanges(int[] nums) {
    	List<String> result = new ArrayList<>();
    	int i=0;
        while ( i< nums.length) {
        	int lastNumber= getLastConsecutiveNumber(i+1,nums);
        	if (lastNumber==i) {
        		result.add(nums[i]+"");
        	}
        	else {
        		result.add(nums[i]+"->"+nums[lastNumber]);
        	}
        	i=lastNumber+1;
        		
        }
        return result;
    }
    
    private static int getLastConsecutiveNumber(int j,int[] nums) {
    	while (j< nums.length && nums[j]== nums[j-1]+1) {
    		j++;
    		
    	}
    	return j-1;
    }

	public static void main(String[] args) {
		// ["0","2->4","6","8->9"]
       int [] nums= {0,2,3,4,6,8,9};
       List<String> result = summaryRanges(nums);
       System.out.println(result);
	}

}
