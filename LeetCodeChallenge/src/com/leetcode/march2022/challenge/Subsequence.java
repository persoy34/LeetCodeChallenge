package com.leetcode.march2022.challenge;

public class Subsequence {

	public static boolean isSubsequence(String s, String t) {
		if(s.equals("")){
            return true;
        }
        
        if(s == null || t == null || t.equals("") || s.length() > t.length() ){
            return false;
        }
        
        int count = 0;
        int subSeqLen = s.length(); 
        
        for(int i=0; i< t.length(); i++){
        	char ch =s.charAt(count);
        	if (!t.contains(ch+"")) return false;		
            if(count < subSeqLen && ch == t.charAt(i)){
                count++;
            }
            if (count == subSeqLen) break;
            
        }
        if(count == subSeqLen){
                return true;
        }
                
        
        return false;
		
	}

	public static void main(String[] args) {
		String s = "axc", t = "ahbgdc";
		boolean result = isSubsequence(s, t);
		System.out.println(result);

	}

}
