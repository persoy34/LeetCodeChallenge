package com.leetcode.october.challange;

import com.letcoode.util.ListNode;

public class ReverseLinkedList {

	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode l = head;
		ListNode r = head;

		while (left < right) {
			l = head;
			int i = 1;

			while (i != left) {
				l = l.next;
				i++;
			}

			r = head;
			i = 1;
			while (i != right) {
				r = r.next;
				i++;
			}

			int temp = l.val;
			l.val = r.val;
			r.val = temp;
			left++;
			right--;
		}
		return head;
	}

	public static void main(String ...strings) {
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
		
		ReverseLinkedList linkedList = new ReverseLinkedList();
		head= linkedList.reverseBetween(head, 2, 5);
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val+" : ");
			temp=temp.next;
		}
		System.out.println();
	}
}
