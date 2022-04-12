package com.leetcode.october.challange;

import java.util.HashMap;
import java.util.Map;

public class StringSearch {
	static boolean  result=true;
	
	public static boolean isStringHasAllValue(String str1, String str2, String str3) {
		 int length = str1.length() +str2.length();
		 int index1=0;
		 int index2=0;
		 String tempStr="";
		 while ((index1+index2) < length && index1 < str1.length() && index2 < str2.length()) {
			 tempStr= tempStr+ str1.charAt(index1)+str2.charAt(index2);
			 index1++;
			 index2++;
		 }
		while (index1 < str1.length()) {
			tempStr+=str1.charAt(index1++);
		}
		while (index2 < str2.length()) {
			tempStr+=str2.charAt(index2++);
		}
		System.out.println(tempStr);
		return tempStr.equalsIgnoreCase(str3)? true: false;
		
	}
	
    private static Map<String,Integer> getCountAsMap(String strText) {
    	// I like dog, because dog is the best friend of man
    	String nonAlphabet =",.;:'@!#$%^&*\"";
    	for (char nalC: nonAlphabet.toCharArray()) {
    		if (strText.contains(nalC+""))
    			strText= strText.replaceAll(nalC+"", "");
    	}
    	String [] strArr = strText.split(" ");
    	
    	Map<String, Integer> resultMap = new HashMap<>();
    	for (String str: strArr) {
    		str= str.toLowerCase();
    		int val= resultMap.getOrDefault(str, 0);
    		resultMap.put(str, ++val);
    	}
    	return resultMap;
    	
    }

	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		String str3="aabbcc";
		boolean result = isStringHasAllValue(str1, str2, str3);
		System.out.println(result);
		str3="bbcaaac";
		result =isStringHasAllValue(str1, str2, str3);
		System.out.println(result);
		
		String strText="I like dog, because dog is the best friend of man";
		Map<String, Integer> resultMap = getCountAsMap(strText);
		System.out.println(resultMap);

	}

}
