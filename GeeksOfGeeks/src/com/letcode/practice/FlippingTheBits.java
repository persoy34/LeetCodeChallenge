package com.letcode.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FlippingTheBits {

	private static long parseLong(String s, int base) {
	    return new BigInteger(s, base).longValue();
	}
    // Complete the flippingBits function below.
    static long flippingBits(long n) {
    	String strVal =String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
    	StringBuilder returnVal =new StringBuilder();
    	for (int i=0; i< strVal.length(); i++) {
    		if (strVal.charAt(i)=='0') {
    			returnVal.append("1");
    		}
    		else {
    			returnVal.append("0");
    		}
    	}
    	long val = parseLong(returnVal.toString(), 2);
    	return val;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            long result = flippingBits(n);
            System.out.println(result);
           
        }

        scanner.close();
    }
}
