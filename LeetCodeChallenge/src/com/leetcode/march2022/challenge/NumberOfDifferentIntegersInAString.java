package com.leetcode.march2022.challenge;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {

	public int numDifferentIntegers(String word) {
		// (?<=\D)(?=\d) - matches a position between a non-digit (\D) and a digit (\d)
        // (?<=\d)(?=\D) - matches a position between a digit and a non-digit.
		String [] arr = word.split("\\D+"); 
		Set<BigInteger> resultSet = new HashSet<>();
		for (String str :arr) {
			if (str.length() >0)
				resultSet.add(new BigInteger(str.trim()));
		}
		
		
		return resultSet.size();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="a123bc34d8ef34";
		NumberOfDifferentIntegersInAString aString = new NumberOfDifferentIntegersInAString();
		int result = aString.numDifferentIntegers(word);
		System.out.println(result);
	}

}
