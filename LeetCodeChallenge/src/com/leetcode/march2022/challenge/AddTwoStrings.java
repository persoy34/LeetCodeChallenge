package com.leetcode.march2022.challenge;

public class AddTwoStrings {

	public static String addStrings(String num1, String num2) {
		int num1Length = num1.length()-1;
		int num2Length = num2.length()-1;
		int sum =0;
		StringBuilder strSum = new StringBuilder();
		while (num1Length > -1 || num2Length > -1 ) {
			if (num1Length >-1 && num2Length > -1) {
				sum+= (num1.charAt(num1Length--) - '0') + (num2.charAt(num2Length--) -'0');
				
			} else if (num1Length > -1) {
				sum+=(num1.charAt(num1Length--) - '0') ;
			} else {
				sum+=(num2.charAt(num2Length--) -'0');
			}
			if (sum >=10) {
				strSum.append(sum%10);
				sum /=10;
			} else {
				strSum.append(sum);
				sum=0;
			}
		}
		if (sum >0) strSum.append(sum);
		return strSum.reverse().toString();
	}

	public static void main(String[] args) {
		String num1 = "456", num2 = "77";
		String result = addStrings(num1, num2);
		System.out.println(result);

	}

}
