package com.leetcode.march2022.challenge;

public class MinimumDominoRotationsForEqualRow {

	public int minDominoRotations(int[] tops, int[] bottoms) {
		int minimumSwap = Math.min(minimumSwap(tops[0], tops, bottoms), minimumSwap(tops[0], bottoms, tops));
		minimumSwap = Math.min(minimumSwap, minimumSwap(bottoms[0], tops, bottoms));
		minimumSwap = Math.min(minimumSwap, minimumSwap(bottoms[0], bottoms, tops));
		return minimumSwap == Integer.MAX_VALUE ? -1 : minimumSwap;
	}
	
	private int minimumSwap(int target, int [] A, int []B) {
		int minimumSwap =0;
		for (int i=0; i< A.length; i++) {
			if (A[i] != target && B[i] != target) {
				return Integer.MAX_VALUE;
			} else if (A[i] != target)
				minimumSwap++;
		}
		return minimumSwap;
	}

	public static void main(String[] args) {
		int [] tops = {2,1,2,4,2,2};
		int [] bottoms = {5,2,6,2,3,2};
		MinimumDominoRotationsForEqualRow dominoRotationsForEqualRow = new MinimumDominoRotationsForEqualRow();
		int result = dominoRotationsForEqualRow.minDominoRotations(tops, bottoms);
		System.out.println(result);
	}

}
