package com.letcode.practice;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        int index=0;
        boolean breakLoop = false;
        for (int i=0; i< strs[0].length() ; i++){
            for (int j=1 ; j<strs.length; j++){
                if (strs[j].length() > i) {
                	if( strs[0].charAt(i) != strs[j].charAt(i)){
                		breakLoop = true;
                		break;
                	} 
                } else {
                	breakLoop = true;
                }
                
            }
            if (breakLoop){
                break;
            } else {
            	index =i+1;
            }
        }
        if (index > 0){
            return strs[0].substring(0, index);
        }
        else {
            return "";
        }
    }

	public static void main(String[] args) {
		String [] strs =  {"dog","racecar","car"};
		LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
		String prefix = commonPrefix.longestCommonPrefix(strs);
		System.out.println(prefix);

	}

}
