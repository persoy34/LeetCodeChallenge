package com.geeksofgeeks.code;

import java.util.Scanner;

public class Loop {
	private static Scanner scanner = new Scanner(System.in);
	
	static int detectLoop(Node node, int N) {
		Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return 1;
            }
        }
        return 0;
        
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
			str = scanner.nextLine();
			int x = Integer.valueOf(str.trim());
			int reverseHead = detectLoop(head, x);
			String val =reverseHead == 1 ? "True" : "False";
			System.out.println(val);
			
		}
	}

}
