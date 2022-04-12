package com.leetcode.february2022.challenge;

public class ExcelSheetColumnTitle {
	public static String convertToTitle(int columnNumber) {
		StringBuilder builder = new StringBuilder();
		while (columnNumber > 0) {
			columnNumber--;
			int n = (columnNumber%26)+ 'A';
			 char ch=(char)n;
			 builder.append(ch);
			 columnNumber/=26;
		}
		
		return builder.reverse().toString();
	}

	public static void main(String[] args) {
		int columnNumber = 701;
		String titleNumber = convertToTitle(columnNumber);
		System.out.println(titleNumber);

	}

}
