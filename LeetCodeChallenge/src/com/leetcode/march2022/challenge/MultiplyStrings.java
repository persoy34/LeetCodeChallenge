package com.leetcode.march2022.challenge;


public class MultiplyStrings {
	public static String multiply(String num1, String num2) {
		int m=num1.length();
	    int n=num2.length();
	    
	    //Base Case
	    if(m==0 || n==0 || "0".equals(num1) || "0".equals(num2))
	        return "0";
	    else if("1".equals(num1))
	        return num2;
	    else if("1".equals(num2))
	        return num1;
	    // Max Result can take m+n digit e.g. 99*999=98901
	    int result[]=new int[m+n];
	    //Now multiply last digit of num1 with last digit of num2
	    for(int i=m-1;i>=0;i--)
	    {
	        for(int j=n-1;j>=0;j--)
	        {
	            int product=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
	            //add previous result into product
	            product+=result[i+j+1];
	            
	            //add product to result
	            result[i+j+1]=product%10;
	            result[i+j]+=product/10;
	        }
	    }
	    
	    StringBuilder sb=new StringBuilder();
	    
	    for(int val:result)
	    {
	        if(sb.length()==0 && val==0)
	        {
	            continue;
	        }
	        else
	        {
	            sb.append(val);
	        }
	    }
	    
	    return sb.toString();
	}	
	
	public static void main(String[] args) {
		//"123456789"
		//"987654321"
		
		
		String num1="498828660196";
		String num2="840477629533";
		String result = multiply(num1, num2);
		System.out.println(result);

	}

}
