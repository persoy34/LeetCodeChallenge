package com.letcode.code.challange;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public boolean isHappy(int n) {
		 List<Integer> list = new ArrayList<>();    
	        boolean isHappy = false;
	        while (!isHappy){
	            String val = n+"";
	            n=0;
	            char[] charArr = val.toCharArray();
	            for (char c: charArr){
	               n+=Math.pow(Integer.valueOf(c+""),2);
	            }
	            if (n == 1){
	                isHappy = true;
	                   break;
	            } else {
	            	//if the value exist in the list, this means that 
	            	// there is a loop and same number is finding so break the loop
	            	if (list.contains(n)) {
	            		break;
	            	}
	            	list.add(n);
	            }
	        }
	        return isHappy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 solution1 = new Solution1();
		boolean result=solution1.isHappy(9);
		System.out.println("result: "+result);
	}

}
