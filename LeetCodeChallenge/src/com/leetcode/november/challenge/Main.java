package com.leetcode.november.challenge;

import java.util.Scanner;

public class Main {
	public static String StringChallenge(String str) {
	    boolean firstNumber=false;
	    int firstIndex=-1;
	    boolean secondNumber=false;
	    int secondIndex=-1;
	    for (int i=0; i< str.length(); i++){
	    	char temp=str.charAt(i);
	      if (Character.isDigit(temp) && str.charAt(i)!=' ') {
	    	  if (!firstNumber) {
	    		  firstNumber=true;
	    		  firstIndex=i;
	    	  } else if (!secondNumber) {
	    		  secondNumber=true;
	    		  secondIndex=i;
	    	  }
	      } else if (Character.isUpperCase(temp)){
	    	   temp=Character.toLowerCase(temp);
	    	  str= str.substring(0,i)+temp+str.substring(i+1);
	      }  else if (Character.isLowerCase(str.charAt(i))) {
	    	   temp=Character.toUpperCase(temp);
	    	  str= str.substring(0,i)+temp+str.substring(i+1);
	      }
	      if (firstNumber && secondNumber) {
		    	char val =str.charAt(firstIndex);
		    	str= str.substring(0,firstIndex)+ str.charAt(secondIndex)+str.substring(firstIndex+1, secondIndex)+val+str.substring(secondIndex+1);
		    	firstIndex=-1;
		    	  secondIndex=-1;
		    	  firstNumber=false;
		    	  secondNumber=false;
		    	
		    }
	      if (!Character.isDigit(temp) && !Character.isAlphabetic(temp)) {
	    	  firstIndex=-1;
	    	  secondIndex=-1;
	    	  firstNumber=false;
	    	  secondNumber=false;
	      }
	    }
	   
	    return str;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(StringChallenge(s.nextLine())); 
	  }
}
