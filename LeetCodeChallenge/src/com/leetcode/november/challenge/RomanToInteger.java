package com.leetcode.november.challenge;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
		map.put("I",1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
		int val=0;
		char [] ch = s.toCharArray();
		int i=0;
		int length = ch.length-1;
        while (i < ch.length) {
        	
        	if (map.get(ch[i]+"")==null) 
        		// it is illegal value
        		return -1;
        	
        		switch (ch[i]){
        			case 'I': if(i<length && ch[i+1]=='V') {
        						val+=4;
        						i+=2;
        					  } else if (i<length && ch[i+1]=='X') {
        						  val+=9;
        						  i+=2;
        					  } else {
        						  val++;
        						  i++;
        					  }
        			          break;
        			case 'V': val+=5;
        			          i++;
        			          break;
        			case 'X': if (i<length && ch[i+1]=='C') {
        						val+=90;
        						i+=2;
        					  } else if (i<length && ch[i+1]=='L') {
        						  val+=40;
        						  i+=2;
        					  }
        			          else {
        						  val+=10;
        						  i++;
        					  }
        			          break;
        			case 'L': val+=50;
        			          i++;
        			          break;
        			case 'C': if (i<length && ch[i+1]=='D') {
        						val+=400;
        						i+=2;
        		              } else if (i<length && ch[i+1]=='M') {
        				        val+=900;
        				        i+=2;
        					  } else {
        						  val+=100;
        						  i++;
        					  }
        			          break;
        			case 'D': val+=500;
        			          i++;
        			          break;
        			case 'M': val+=1000;
        			          i++;
        			          break;
        			          
        		}
        
        }
        return val;

    }


	public static void main(String[] args) {
		RomanToInteger romanToInteger = new RomanToInteger();
		int result = romanToInteger.romanToInt("LVIII");
		System.out.println(result);

	}

}
