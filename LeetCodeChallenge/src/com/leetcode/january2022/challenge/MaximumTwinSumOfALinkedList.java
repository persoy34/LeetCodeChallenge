package com.leetcode.january2022.challenge;

import java.util.ArrayList;
import java.util.List;

import com.letcoode.util.ListNode;

public class MaximumTwinSumOfALinkedList {
	public int pairSum(ListNode head) {
		List<Integer> list =convertLinkedListToList(head);
		int size=list.size();
		int result= 0;
		for (int i=0; i<=(size/2)-1; i++) {
			result = Math.max(result, list.get(i)+list.get(size-i-1));
		}
		return result;
	}

	private List<Integer> convertLinkedListToList(ListNode head){
		List<Integer>list = new ArrayList<>();
		int index=0;
		while(head != null) {
			list.add(index++,head.val);
			head=head.next;
		}
		return list;
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(100000);
		head.next= node1;
//		ListNode node2= new ListNode(2);
//		node1.next= node2;
//		ListNode node3 = new ListNode(3);
//		node2.next= node3;
		MaximumTwinSumOfALinkedList aLinkedList = new MaximumTwinSumOfALinkedList();
		int result = aLinkedList.pairSum(head);
		System.out.println(result);

	}

}
