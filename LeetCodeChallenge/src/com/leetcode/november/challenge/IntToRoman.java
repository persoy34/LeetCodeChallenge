package com.leetcode.november.challenge;

public class IntToRoman {
	public String intToRoman(int num) {
        String[] units={"", "I", "II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hund={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thou={"","M","MM","MMM"};
        
        return thou[num/1000] + hund[(num%1000)/100]+tens[(num%100)/10]+units[num%10];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
