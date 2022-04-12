package com.geeksofgeeks.code;

import java.util.*;

class GFG2 {
    private static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) {
	    String str = scanner.nextLine();
		int testCaseNum = Integer.valueOf(str.trim());
		for (int i = 0 ; i< testCaseNum; i++) {
			str = scanner.nextLine();
			String [] strs = str.split(" ");
			int arrSize = Integer.valueOf(strs[0].trim());
			int searchVal = Integer.valueOf(strs[1].trim());
			str = scanner.nextLine();
			strs = str.split(" ");
			int count = 0;
			for (int l =0 ; l< arrSize; l++) {
				int v = Integer.valueOf(strs[l].trim());
				if (searchVal == v) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(-1);
			}
			else {
				System.out.println(count);
			}
		}
	}
}