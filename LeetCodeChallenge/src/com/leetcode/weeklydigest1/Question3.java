package com.leetcode.weeklydigest1;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
	public List<Integer> findLonely(int[] nums) {
		List<Integer> result= new ArrayList<>();
		for (int i=0; i< nums.length; i++) {
			int val= nums[i];
			if (!exist(nums,  val, i,val-1, val+1)) {
				result.add(val);
			}
		}
		return result;
	}
	 private boolean exist(int [] nums,int val, int index, int val1, int val2) {
		 for (int i=0; i< nums.length; i++) {
			 if (i != index && nums[i]== val)
				 return true;
			 if (nums[i]== val1 || nums[i]==val2) 
				 return true;
		 
		 }
			
		 return false;
	 }

	public static void main(String[] args) {
		int [] nums = {1,3,5,3};
		Question3 question3 = new Question3();
		List<Integer> result = question3.findLonely(nums);
		System.out.println(result);

	}

}
