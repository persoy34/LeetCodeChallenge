package com.letcode.code.challange;

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
	private ListNode addNode(int val, ListNode head) {
		if (head == null) {
			head = new ListNode(val);
			
		} else {
			ListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			ListNode newNode = new ListNode(val);
			temp.next = newNode;
		}
		return head;
	}
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null ) {
        	slow= slow.next;
        	fast= fast.next.next;
        }
        return slow;
    }
    
    public static void main(String ...strings) {
    	Solution solution = new Solution();
    	ListNode head = null;
    	head = solution.addNode(1, head);
    	head = solution.addNode(2, head);
    	head = solution.addNode(3, head);
    	head = solution.addNode(4, head);
    	head = solution.addNode(5, head);
    	head = solution.addNode(6, head);
    	ListNode middle = solution.middleNode(head);
    	System.out.println("middle :"+middle.val);
    }
}