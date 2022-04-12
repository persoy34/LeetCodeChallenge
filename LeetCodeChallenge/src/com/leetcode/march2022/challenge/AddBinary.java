package com.leetcode.march2022.challenge;

public class AddBinary {

	public static String addBinary(String a, String b) {
         int lengthb = b.length()-1;
         int lengtha = a.length()-1;
         int remaining=0;
         StringBuilder result = new StringBuilder();
         
         while (lengtha >-1 || lengthb > -1) {
        	 int total=0;
        	 if (lengtha >-1 && lengthb > -1)
        	     total = (a.charAt(lengtha--)-'0')  + (b.charAt(lengthb--)-'0') +remaining;
        	 else if (lengtha > -1)
        		 total = (a.charAt(lengtha--)-'0') + remaining;
        	 else total = (b.charAt(lengthb--)-'0') +remaining;
        	remaining = 0;
        	if (total >=2) {
        		total %=2;
        		remaining =1;
        	}
        	result.append(total);
        	
         }
         if (remaining != 0) result.append(remaining);
         return result.reverse().toString();
	}

	public static void main(String[] args) {
		String a = "1111", b = "1111";
		String result = addBinary(a, b);
		System.out.println(result);
	}

}
