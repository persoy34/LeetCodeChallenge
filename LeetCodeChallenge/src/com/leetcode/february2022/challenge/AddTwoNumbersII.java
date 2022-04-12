package com.leetcode.february2022.challenge;

import java.util.Stack;

import com.letcoode.util.ListNode;

public class AddTwoNumbersII {
	static int remain =0;
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<ListNode> stack1 = new Stack<>();
		Stack<ListNode> stack2 = new Stack<>();
		ListNode head = null;
		while (l1 != null) {
			stack1.push(l1);
			l1=l1.next;
		}
		while (l2 != null) {
			stack2.push(l2);
			l2=l2.next;
		}
		while (!stack1.isEmpty() || !stack2.isEmpty() || remain > 0) {
			int val=remain;
			if (!stack1.isEmpty()) {
				ListNode temp = stack1.pop();
				val+=temp.val;
			}
			if (!stack2.isEmpty()) {
				ListNode temp =stack2.pop();
				val+=temp.val;
			}
			
			remain = val /10;
			
			ListNode temp= new ListNode(val%10);
			temp.next =head;
			head=temp;
			
		}
		
		return head;
		
	}
	
	public static void main(String[] args) {
		// l1 = [7,2,4,3], l2 = [5,6,4]
		ListNode l1 = new ListNode(5);
//		ListNode l10 = new ListNode(4);
//		l1.next = l10;
//		ListNode l11 = new ListNode(3);
//		l10.next = l11;
//		ListNode l12 = new ListNode(3);
//		l11.next = l12;
		
		ListNode l2 = new ListNode(5);
//		ListNode l20 = new ListNode(6);
//		l2.next = l20;
//		ListNode l21 = new ListNode(4);
//		l20.next = l21;
		ListNode result = addTwoNumbers(l1, l2);
		while (result != null) {
			System.out.print(result.val+"->");
			result = result.next;
		}
		

	}

}
