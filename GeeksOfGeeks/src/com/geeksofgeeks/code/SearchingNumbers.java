package com.geeksofgeeks.code;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingNumbers {




	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testNumber = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i< testNumber; i++) {
			int index= -1;
			String val1 = sc.nextLine();
			String [] valStr = val1.split(" ");
			int arrSize = Integer.valueOf(valStr[0].trim());
			int searchNumber = Integer.valueOf(valStr[1].trim());
			val1 = sc.nextLine();
			String [] array1 = val1.split(" ");
			int [] intArr = new int[arrSize];
			for (int j = 0; j< arrSize; j++) {
				intArr[j]= Integer.valueOf(array1[j].trim());
				if (intArr[j]==searchNumber) {
					index = j+1;
					break;
				}
			}
			System.out.println(index);
			
		}
	}
}