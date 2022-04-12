package com.leetcode.march2022.challenge;

import com.letcoode.util.ListNode;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		ListNode x = head; // creating copy of head in x to iterate the list while keeping the head unchanged
        if( x == null || k==0) return head; // if list is empty or if we don't have to rotate the list, return it
        int n = 1;  // counting no. of nodes in the list 
        while( x.next != null){ 
            x = x.next;// after while loop x point the tail node
            n++;
        }
        
        int i = 1;
        k = k%n;  // updating k acc. to point n
        if(k==0 || n==1) return head; // list will not change in this case, so just return it
        ListNode y = head;
        while( i < n-k ){
            y = y.next;
            i++;
        }
        ListNode newHead = y.next; // Creating a new head point which points to (n-k)th node
        y.next = null;   // pointing the (n- k-1)th node to null
        x.next = head; // pointing the last pointer to first node.
        
        return newHead;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		head.next = node;
		node.next = node1;
		node1.next = node2;
		node2.next =node3;
		RotateList rotateList = new RotateList();
		ListNode newHead = rotateList.rotateRight(head, 2);
		System.out.println(newHead.val);
	}

}
