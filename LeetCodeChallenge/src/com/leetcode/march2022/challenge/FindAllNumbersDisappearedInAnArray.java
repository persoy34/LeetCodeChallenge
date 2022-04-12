package com.leetcode.march2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public  List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		int [] numbers = new int [nums.length];
		for (int i=0; i<nums.length ; i++) {
				numbers[nums[i]-1]=1;
		}
		for (int i=0; i< numbers.length; i++) {
			if (numbers[i]==0) {
				 result.add(i+1);
			}
		}
		return result;

	}
	

	public static void main(String[] args) {
		int [] nums = {1,1};
		FindAllNumbersDisappearedInAnArray allNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
		List<Integer> result =allNumbersDisappearedInAnArray.findDisappearedNumbers(nums);
		System.out.println(result);

	}

}
