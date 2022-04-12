package com.leetcode.march2022.challenge;

public class SmallestStringWithAGivenNumericValue {
	
	public String getSmallestString(int n, int k) {
        char []  result= new char[n];
        k=k-n;
        int zVaue =k/25;
        int otherVal = k %25;
        int i= n-1;
        while (zVaue-- > 0) {
        	result[i--]='z';
        }
        
        if (otherVal > 0) {
        	result[i--] = (char)('a'+otherVal);
        }
        while (i >=0) {
        	result[i--]='a';
        }
        return new String(result);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
