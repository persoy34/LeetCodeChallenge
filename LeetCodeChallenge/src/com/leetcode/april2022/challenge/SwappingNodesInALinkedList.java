package com.leetcode.april2022.challenge;


import com.letcoode.util.ListNode;

public class SwappingNodesInALinkedList {
	public ListNode swapNodes(ListNode head, int k) {
		int size=0;
	       ListNode temp= head;
	       while (temp!=null) {
	    	   temp=temp.next;
	    	   size++;
	       }
	       int [] arr = fillArray(head, size);
	       
	       int beginIndex=k-1;
	       int endIndex = size - k;
	       int tempVal = arr[beginIndex];
	       arr[beginIndex]=arr[endIndex];
	       arr[endIndex]=tempVal;
	       temp=head;
	       for (int i=0; i<size; i++) {
	    	   temp.val=arr[i];
	    	   temp=temp.next;
	       }
	       return head;
	    }
		
		private int [] fillArray( ListNode head, int size) {
			int [] arr = new int[size];
			ListNode temp= head;
			int index=0;
		    while (temp!=null) {
		    	arr[index++]=temp.val;
		    	temp=temp.next;
		    }
		    return arr;
		       
		}
	public static void main(String[] args) {
		// head = [7,9,6,6,7,8,3,0,9,5], k = 5
		ListNode head = new ListNode(100);
		ListNode node = new ListNode(90);
//		ListNode node1= new ListNode(6);
//		ListNode node2 = new ListNode(6);
//		ListNode node3 = new ListNode(7);
//		ListNode node4 = new ListNode(8);
//		ListNode node5 = new ListNode(3);
//		ListNode node6 = new ListNode(0);
//		ListNode node7 = new ListNode(9);
//		ListNode node8 = new ListNode(5);
		head.next = node;
//		node.next= node1;
//		node1.next= node2;
//		node2.next= node3;
//		node3.next = node4;
//		node4.next = node5;
//		node5.next = node6;
//		node6.next = node7;
//		node7.next = node8;
		
		SwappingNodesInALinkedList aLinkedList = new SwappingNodesInALinkedList();
		head = aLinkedList.swapNodes(head, 2);
		while (head != null) {
			System.out.print(head.val+" ");
			head=head.next;
		}

	}

}
