package com.geeksofgeeks.code;

import java.util.Scanner;

public class GetMiddleNode {
	private static Scanner scanner = new Scanner(System.in);
	static int getMiddle(Node head){
	         Node tail = head;
	         Node middle = head;
	         while (tail != null && tail.next != null) {
	        	 tail= tail.next.next;
	        	 middle = middle.next;
	         }
	         return middle.data;
	 }

public static void main(String... strings) {
		String str = scanner.nextLine();
		int testCaseNum = Integer.valueOf(str.trim());
		for (int k = 0; k < testCaseNum; k++) {
			str = scanner.nextLine();
			int listSize = Integer.valueOf(str.trim());
			str = scanner.nextLine();
			String [] strArr =str.split(" ");
			
			Node head = null;
			for (int i = 0; i < listSize; i++) {
				int val = Integer.valueOf(strArr[i].trim());
				if (head == null) {
					head = new Node(val);
				} else {
					Node tail = head;
					while (tail.next != null) {
						tail = tail.next;
					}
					Node newNode = new Node(val);
					tail.next = newNode;
				}
			}
			int count = getMiddle(head);
			System.out.println(count);
		}
	}

}
