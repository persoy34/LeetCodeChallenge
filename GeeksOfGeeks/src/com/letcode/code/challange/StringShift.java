package com.letcode.code.challange;

public class StringShift {
	public String stringShift(String s, int[][] shift) {
        for (int i=0; i< shift.length; i++) {
        	int [] temp = shift[i];
        	int d = temp[1];
        	if (temp[0] ==0) {
        		s = s.substring(d) + s.substring(0, d);
        	}
        	else if (temp[0] == 1) {
        		s = s.substring(s.length()-d) + s.substring(0, s.length()-d);
        	}
        }
        return s;
    }
	public static void main(String[] args) {
		int [][] shift = {{1,1},{1,1},{0,2},{1,3}};
		String s = "abcdefg";
		StringShift stringShift = new StringShift();
		String lastString = stringShift.stringShift(s, shift);
		System.out.println("lastString="+lastString);
	}

}
