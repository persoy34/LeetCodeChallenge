package com.leetcode.march2022.challenge;

import com.letcoode.util.ListNode;

public class RemoveDuplicatesFromSortedList {
	
	 public ListNode deleteDuplicates(ListNode head) {
		 ListNode temp=head;
		 ListNode prev=null;
		 while (temp!= null) {
			 prev=temp;
			 temp=temp.next;
			 boolean duplicate=false;
			 while (temp != null && temp.val == prev.val) {
				 duplicate =true;
				 temp=temp.next;
			 }
			 if (duplicate) {
				 prev.next=temp;
			 }
		 }
	      return head;  
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
