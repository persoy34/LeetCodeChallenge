package com.leetcode.march2022.challenge;

import java.util.Arrays;

public class DecodeXORedArray {

	public static int[] decode(int[] encoded, int first) {
		// encoded[i] = arr[i] XOR arr[i + 1]
		int [] decoded = new int [encoded.length+1];
		decoded[0]=first;
		for (int i=0; i< encoded.length; i++) {
			// c = a^b;
			decoded[i+1]= encoded[i]^decoded[i];
		}
		return decoded;
	}

	
	public static void main(String[] args) {
		int [] encoded = {6,2,7,3};
		int first = 4;
        int [] decoded = decode(encoded, first);
        System.out.println(Arrays.toString(decoded));
	}

}
