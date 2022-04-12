package com.leetcode.january2022.challenge;


public class CountAndSay {

	public String countAndSay(int n) {
		String rs = "1";
		int i = 1;
		while (i < n) {
			rs = countAndSay(rs);
			i++;
		}
		return rs;
	}

	private String countAndSay(String rs) {
		StringBuilder builder = new StringBuilder();
		int count = 0;
		int number = -1;
		for (int i = 0; i < rs.length(); i++) {
			int n = Character.getNumericValue(rs.charAt(i));
			if (count == 0 || number == n) {
				count++;
			} else {
				builder.append(count + "" + number);
				count = 1;
			}
			number = n;

		}
		if (count > 0) {
			builder.append(count + "" + number);
		}

		return builder.toString();
	}

	public static void main(String[] args) {
		CountAndSay andSay = new CountAndSay();
		String result = andSay.countAndSay(5);
		System.out.println(result);

	}

}
