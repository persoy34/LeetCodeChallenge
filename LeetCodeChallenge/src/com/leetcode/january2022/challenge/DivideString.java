package com.leetcode.january2022.challenge;


public class DivideString {
	public String[] divideString(String s, int k, char fill) {
        int size =0;
        if (s==null || s.length() ==0)
        	return new String[0];
        if (s.length() % k ==0) {
        	size = s.length() / k;
        } else {
        	size = s.length() / k +1;
        }
        String [] result = new String[size];
        int fi=0;
        int si=k;
        int i=0;
        while (s.length() >= k) {
        	String temp =s.substring(fi, si);
        	result[i++]=temp;
        	s=s.substring(si);
        }
        if (s.length() >0) {
        	for (int j=s.length(); j<k; j++) {
        		s+=fill+"";
        	}
        	result[i]=s;
        }
        return result;
        	
    }

	public static void main(String[] args) {
	  String	s = "abcdefghij";
	  int k = 3;
	  char fill = 'x';
	  DivideString divideString = new DivideString();
	  String [] result = divideString.divideString(s, k, fill);
	  for (String r: result) {
		  System.out.println(r);
	  }

	}

}
