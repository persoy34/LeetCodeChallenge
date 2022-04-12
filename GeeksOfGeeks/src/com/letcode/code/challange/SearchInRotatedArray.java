package com.letcode.code.challange;

public class SearchInRotatedArray {
	    public int search(int[] nums, int target) {
	        int index =-1;
	        for (int i=nums.length-1 ; i >= 0; i--){
	            if (target > nums[i]){
	                continue;
	            }
	            else if (target == nums[i]){
	                index= i;
	                break;
	            }
	            
	        }
	        return index;
	    }
	    
	    public static void main(String ...strings ) {
	    	int [] nums = {4,5,6,7,0,1,2};
	    	int target = 0;
	    	SearchInRotatedArray array = new SearchInRotatedArray();
	    	int place = array.search(nums, target);
	    	System.out.println("Place: "+place);
	    }
}
