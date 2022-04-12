package com.leetcode.april2022.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargest {
	PriorityQueue<Integer> pQueue
    = new PriorityQueue<Integer>();
	private int k;

	public KthLargest(int k, int[] nums) {
        this.k=k;
        for (int i=0; i< nums.length; i++) {
        	add(nums[i]);
        }
    }

	public int add(int val) {
		pQueue.add(val);
		if (pQueue.size() > k) {
			while (pQueue.size() > k)
				pQueue.poll();
		}
		
		return  pQueue.peek();
	}

	public static void main(String[] args) {
		//KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
		//kthLargest.add(3);   // return 4
		//kthLargest.add(5);   // return 5
		//kthLargest.add(10);  // return 5
		//kthLargest.add(9);   // return 8
		//kthLargest.add(4);   // return 8
		int [] nums = {4, 5, 8, 2};
		int k=3;
		KthLargest kthLargest = new KthLargest(k,nums);
		int val = kthLargest.add(3);
		System.out.println(val);
		val = kthLargest.add(5); 
		System.out.println(val);
		val = kthLargest.add(10);
		System.out.println(val);
		val = kthLargest.add(9);
		System.out.println(val);
		val = kthLargest.add(4);
		System.out.println(val);
	}

}
