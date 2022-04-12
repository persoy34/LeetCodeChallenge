package com.geeksofgeeks.code;

import java.util.Scanner;

public class FindIndexNode {
	private static Scanner scanner = new Scanner(System.in);
	
	public static int getNth(Node node, int ind)
    {
       for (int i = 1; i<ind; i++) {
    	   if (node != null) {
    		   node = node.next;
    	   }
       }
       return node.data;
    }
	
public static void main(String... strings) {
		
		String str = scanner.nextLine();
		int testCaseNum = Integer.valueOf(str.trim());
		for (int k = 0; k < testCaseNum; k++) {
			str = scanner.nextLine();
			String[] strArr = str.split(" ");
			int size = Integer.valueOf(strArr[0].trim());
			int searchIndex = Integer.valueOf(strArr[1].trim());
			str = scanner.nextLine();
			strArr =str.split(" ");
			
			Node head = null;
			for (int i = 0; i < size; i++) {
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
			int count = getNth(head, searchIndex);
			System.out.println(count);
		}
	}
}
