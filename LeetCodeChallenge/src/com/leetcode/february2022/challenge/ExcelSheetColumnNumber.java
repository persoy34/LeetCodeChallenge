package com.leetcode.february2022.challenge;

public class ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
		int columnNumber = 0;
		for (int i = 0; i < s.length(); i++)
			columnNumber = columnNumber * 26 + s.charAt(i) - 'A' + 1;
		return columnNumber;
//        return s.chars().reduce(0, (result, ch) -> result * 26 + (ch - 'A' + 1));
    }

	public static void main(String[] args) {
	 String	columnTitle = "ZY";
	 int result = titleToNumber(columnTitle);
	 System.out.println(result);

	}

}
