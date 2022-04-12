package com.letcode.code.challange;

public class Solution7 {
	public boolean backspaceCompare(String S, String T) {
	  String str1= removeChar(S);
	  String str2= removeChar(T);
	  return str1.equals(str2);
    }
	
	private String removeChar(String str) {
		StringBuilder builder = new StringBuilder(str);
		int i=0;
		while (i< builder.length() && i>=0) {
			if (builder.charAt(i)=='#') {
				if (i > 0) {
					builder.deleteCharAt(i-1);
					i--;
				}
				builder.deleteCharAt(i);
				i--;
			}
			else {
				i++;
			}
			if (i <0)
				i=0;
		}
		return builder.toString();
	}
	public static void main(String[] args) {
		String	S = "ab##";
		String T = "c#d#";
		Solution7 solution7 = new Solution7();
		boolean result =  solution7.backspaceCompare(S, T);
		System.out.println("result: "+result);
	}

}
