package com.geeksofgeeks.code;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}
class CountNodes{
	private static Scanner scanner = new Scanner(System.in);
    public static int getCount(Node head){
        int number = 0;
        Node tail = head;
        while (tail != null) {
        	tail= tail.next;
        	number++;
        }
        return number;
    }

	public static void main(String... strings) {
		
		String str = scanner.nextLine();
		int testCaseNum = Integer.valueOf(str.trim());
		for (int k = 0; k < testCaseNum; k++) {
			str = scanner.nextLine();
			int numberOfNodes = Integer.valueOf(str);
			str = scanner.nextLine();
			String[] strArr = str.split(" ");
			Node head = null;
			for (int i = 0; i < numberOfNodes; i++) {
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
			int count = getCount(head);
			System.out.println(count);
		}
	}
}