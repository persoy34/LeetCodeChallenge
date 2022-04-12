package com.geeksofgeeks.code;

import java.util.Scanner;

public class ReverseLinkedList {
	private static Scanner scanner = new Scanner(System.in);
	
	static Node reverseList(Node head){
		Node prev = null;
	    Node curr = head;
	    while (curr != null) {
	        Node nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
	}
	static Node  addNode(Node head, int value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			Node newNode = new Node(value);
			tail.next = newNode;
		}
		return head;
	}
	public static void main(String... strings) {
//		String str = scanner.nextLine();
//		int testCaseNum = Integer.valueOf(str.trim());
//		for (int k = 0; k < testCaseNum; k++) {
//			str = scanner.nextLine();
//			int listSize = Integer.valueOf(str.trim());
//			str = scanner.nextLine();
//			String [] strArr =str.split(" ");
//			
//			Node head = null;
//			for (int i = 0; i < listSize; i++) {
//				int val = Integer.valueOf(strArr[i].trim());
//				if (head == null) {
//					head = new Node(val);
//				} else {
//					Node tail = head;
//					while (tail.next != null) {
//						tail = tail.next;
//					}
//					Node newNode = new Node(val);
//					tail.next = newNode;
//				}
//			}
		   Node head = null;
		   String str = scanner.nextLine();
		   int val= Integer.valueOf(str);
		   while (val != 0) {
			   head = addNode(head, val);
			   str = scanner.nextLine();
			   val= Integer.valueOf(str);
			   
		   }
				   
			Node reverseHead = reverseList(head);
			while (reverseHead != null) {
				System.out.print(reverseHead.data+" ");
				reverseHead= reverseHead.next;
			}
		}
	}


