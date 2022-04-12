package com.leetcode.october.challange;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

	public List<String> restoreIpAddresses(String s) {
	    List<String> ans=new ArrayList<>();
        ans = generateIpAddress(s,0,"",ans);
        return ans;
	}

	public List<String> generateIpAddress(String s, int part, String asf, List<String> ans) {
		if (part == 4) {
			if (s.length() == 0) {
				ans.add(asf);
			}
			return ans;
		}
		for (int i = 1; i < 4; i++) {
			if (s.length() >= i) {
				String sbstr = s.substring(0, i);
				if (Integer.parseInt(sbstr) > 255)
					return ans;
				if (i != 1) {
					if (sbstr.charAt(0) == '0') {
						return ans;
					}
				}
				generateIpAddress(s.substring(i), part + 1, asf + sbstr + (part == 3 ? "" : "."), ans);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
		List<String> ans = restoreIPAddresses.restoreIpAddresses("25525511135");
		System.out.println(ans);

	}

}
