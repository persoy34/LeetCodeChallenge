package com.leetcode.january2022.challenge;

import com.letcoode.util.ListNode;

public class MaximumTwinSumOfALinkedList2 {

	public int pairSum(ListNode head) {
		ListNode slowPointer=head;
		ListNode fastPointer=head;
		while (fastPointer != null ) {
			slowPointer= slowPointer.next;
			if (fastPointer.next != null)
				fastPointer= fastPointer.next.next;
			else fastPointer= fastPointer.next;
		}
		ListNode reverseHalf = reverseList(head, slowPointer);
		ListNode firstStart = reverseHalf;
		ListNode firstEnd= slowPointer;
		ListNode secondStart= slowPointer;
		int result = 0;
		while (firstStart != slowPointer && secondStart != null) {
			result = Math.max( result, firstStart.val+ secondStart.val);
			firstStart= firstStart.next;
			secondStart= secondStart.next;
		}
		return result;
	}

	public ListNode reverseList(ListNode head, ListNode end) {
        if (head == null || head.next == null) return head;
       ListNode prev = null;
       ListNode current = head;
       ListNode next= null;
       while(current != end) {
       	next = current.next;
       	current.next = prev;
       	prev= current;
       	current= next;
       }
       return prev;
   }
	public static void main(String[] args) {
		ListNode head = new ListNode(7);
		ListNode node1 = new ListNode(9);
		head.next= node1;
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		ListNode node3 = new ListNode(10);
		node2.next= node3;
		ListNode node4 = new ListNode(1);
		node3.next = node4;
		ListNode node5 = new ListNode(8);
		node4.next= node5;
		ListNode node6 = new ListNode(6);
		node5.next= node6;
		ListNode node7 = new ListNode(3);
		node6.next= node7;
		
		MaximumTwinSumOfALinkedList2 aLinkedList2 = new MaximumTwinSumOfALinkedList2();
		int result = aLinkedList2.pairSum(head);
		System.out.println(result);

	}

}
