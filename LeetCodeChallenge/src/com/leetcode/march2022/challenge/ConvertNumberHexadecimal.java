package com.leetcode.march2022.challenge;

public class ConvertNumberHexadecimal {
	
	private final char [] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

	public String toHex(int num) {
		if (num == 0)
			return "0";
		StringBuilder result = new StringBuilder();
		int i=0;
		while (i < 8 && num != 0) {
			result.append(hex[num & 15]);
			num=num>> 4;
		    i++;
		}
		return result.reverse().toString();
		
	}

	public static void main(String[] args) {
		int num = 26;
		ConvertNumberHexadecimal convertNumberHexadecimal = new ConvertNumberHexadecimal();
		String result = convertNumberHexadecimal.toHex(num);
		System.out.println(result);
	}

}
