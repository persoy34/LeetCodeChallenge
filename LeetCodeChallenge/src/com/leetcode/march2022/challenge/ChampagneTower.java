package com.leetcode.march2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class ChampagneTower {

	/**
	 * 	The Champagne Tower is a Pascal's Triangle (PT)
		Each row in a PT has 1 more element (glass in this case) than the previous row, so the number of elements in row are 1, 2, 3, ..., n
		First and last element of a PT are equal. Analogously, the first and last glasses in each row will have the same units of champagne
		To solve this problem, imagine that all the champagne (say n) has been poured into the top most glass all at once, s.t. it'll have n units at the beginning. Then it starts to flow down, getting divided equally into its bottom-left and bottom-right glasses.
		Except the terminal glasses, which will have 1 glass, all the other glasses will have 2 glasses pouring into them
		Each glass will take up to 1 unit of champagne and pour the rest to its 2 child glasses, so subtract 1 for self and give the rest away equally to the children
		So if we process 1 row at a time, up to queryRow times and maintain the amount of champaign units in an array, then array[queryGlass] will be the required result

	 * @param poured
	 * @param query_row
	 * @param query_glass
	 * @return
	 */
	public double champagneTower(int poured, int query_row, int query_glass) {
		if (poured == 0)
			return 0;
		List<Double> prevRow = new ArrayList<>(List.of((double) poured));

		while (query_row-- > 0) {
			List<Double> currentRow = new ArrayList<Double>();
			double champagneInEnds = Math.max(0, (prevRow.get(0) - 1) / 2);  // min champagne can be 0
			currentRow.add(champagneInEnds); // first glass

			for (int i = 1; i < prevRow.size(); i++)
				currentRow.add(Math.max(0, (prevRow.get(i - 1) - 1) / 2) + // flow from top-left glass
							   Math.max(0, (prevRow.get(i) - 1) / 2));     // flow from top-right glass

			currentRow.add(champagneInEnds); // last glass
			prevRow = currentRow;
		}
		return Math.min(1, prevRow.get(query_glass)); // max champagne can be 1
	}

	public static void main(String[] args) {
		int poured = 2, query_row = 1, query_glass = 1;
		ChampagneTower champagneTower = new ChampagneTower();
		double result=champagneTower.champagneTower(poured, query_row, query_glass);
		System.out.println(result);
		

	}

}
