package com.leetcode.march2022.challenge;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegersbyTheNumberOf1Bits {

	public int[] sortByBits(int[] arr) {
		
		return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(i -> Integer.bitCount(i) * 10000 + i))
                .mapToInt(i -> i)
                .toArray();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
