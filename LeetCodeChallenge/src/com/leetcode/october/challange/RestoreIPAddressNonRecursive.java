package com.leetcode.october.challange;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddressNonRecursive {
	
	public List<String> restoreIpAddresses(String s) {
	    List<String> ans=new ArrayList<>();
	    int n=s.length();
       for (int i=1; i<n && i<4; ++i) {
    	   String first = s.substring(0,i);
    	   if (!isValid(first))
    		   continue;
    	   for (int j=1; j+i < n && j<4; ++j) {
    		   String second =s.substring(i, j+i);
    		   if (!isValid(second))
    			   continue;
    		   for (int k=1; i+j+k <n && k < 4; ++k) {
    			   String third = s.substring(j+i, j+i+k);
    			   String fourth =s.substring(j+i+k);
    			   if (!isValid(third) || !isValid(fourth))
    				   continue;
    			   ans.add(first+"."+second+"."+third+"."+fourth);
    		   }
    	   }
       }
        return ans;
	}


	private boolean isValid (String s) {
		if (s.length() > 3)
			return false;
		if (s.startsWith("0") && s.length() > 1)
			return false;
		int val = Integer.parseInt(s);
		return val >=0 && val <=255;
	}
	public static void main(String[] args) {
		RestoreIPAddressNonRecursive restoreIPAddresses = new RestoreIPAddressNonRecursive();
		List<String> ans = restoreIPAddresses.restoreIpAddresses("25525511135");
		System.out.println(ans);

	}

}
