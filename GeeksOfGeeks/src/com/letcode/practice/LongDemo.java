package com.letcode.practice;

public class LongDemo {

	   public static void main(String[] args) {

	      long l = 1;
	      System.out.println("Number = " + l);

	      /* returns the string representation of the unsigned long value 
	         represented by the argument in binary (base 2) */
	      String val = String.format("%16s", Long.toBinaryString(l)).replace(' ', '0');
	      System.out.println("Binary is " + val);

	      // returns the number of one-bits 
	      System.out.println("Number of one bits = " + Long.bitCount(l)); 
	   } 
	}  
