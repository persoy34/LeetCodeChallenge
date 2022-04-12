package com.leetcode.march2022.challenge;

import java.util.HashSet;
import java.util.Set;

import com.letcoode.util.ListNode;

public class RemoveDuplicateFromLinkedList {

	public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode prev= null;
		while (temp != null) {
			prev=temp;
			temp=temp.next;
			boolean duplicate=false;
			while (temp!= null && temp.val == prev.val) {
				duplicate=true;
				temp=temp.next;
			}
			if (duplicate) {
				ListNode node = head;
				if (prev != head) {
					while (node.next != prev)
						node=node.next;
					node.next=temp;
				} else {
					head = temp;
				}
			}
			
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1= new ListNode(1);
		head.next = node1;
		ListNode node2 = new ListNode(1);
		node1.next= node2;
		ListNode node3 = new ListNode(2);
		node2.next = node3;
		ListNode node4 = new ListNode(3);
		node3.next= node4;
		ListNode node5 = new ListNode(3);
		node4.next= node5;
//		ListNode node6 = new ListNode(5);
//		node5.next = node6;
		
		head = deleteDuplicates(head);
		while (head != null) {
			System.out.print(head.val+"::");
			head=head.next;
		}
		System.out.println();

	}

}
