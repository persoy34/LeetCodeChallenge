package com.letcode.practice;

public class ConvertStringToInt {
public int myAtoi(String str) {
        
        // time complexity : O(log(str.length()))
        // space complexity : O(1)
        
        str = str.trim();  // remove whitespaces
        int sign = 1;   // positive then 1 else negative -1
        int cnum = 0,num = 0;
        for(int i = 0; i < str.length();i++) {
            // To get the current number
            cnum = str.charAt(i) - 48; // current digit
            if(cnum >= 0 && cnum <= 9) {
                // if number is greater than max value return max value
                if (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE / 10 && cnum > 7)) return Integer.MAX_VALUE;
                
                // if number is less than min value return min value
                else if (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE / 10 && cnum > 8)) return Integer.MIN_VALUE;
                
                
                else {
                    num = num *10 + sign * cnum;
                }
            }
            else if(i == 0) {
                if(str.charAt(i) == '+') 
                    continue;
                else if(str.charAt(i) == '-')
                    sign  = -1;
                else break;
            }
            else break;
        }
        return num;
    }
	public static void main(String...strings) {
		String val1="-236";
		ConvertStringToInt convertStringToInt = new ConvertStringToInt();
		int intVal= convertStringToInt.myAtoi(val1);
		System.out.println(intVal);
	}
}
