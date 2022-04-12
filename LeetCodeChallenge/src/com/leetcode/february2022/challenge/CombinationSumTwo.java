package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumTwo {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Set<List<Integer>> result = new HashSet<>();
		Arrays.sort(candidates);
		List<Integer> tempAdd = new ArrayList<>();
		result = recursiveCombinationSum(candidates, 0, tempAdd, result, target);

		return new ArrayList<>(result);

	}

	private Set<List<Integer>> recursiveCombinationSum(int[] candidates, int firstIndex, List<Integer> tempAdd,
			Set<List<Integer>> result, int target) {
		if (target == 0)
			result.add(new ArrayList<>(tempAdd));
		for (int i = firstIndex; i < candidates.length; i++) {
			if (i > firstIndex && candidates[i] == candidates[i - 1])
				continue;
			if (candidates[i] > target)
				break;
			else {
				tempAdd.add(candidates[i]);
				recursiveCombinationSum(candidates, i + 1, tempAdd, result, target - candidates[i]);
				tempAdd.remove(tempAdd.size() - 1);
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		CombinationSumTwo combinationSumTwo = new CombinationSumTwo();
		List<List<Integer>> result = combinationSumTwo.combinationSum2(candidates, target);
		System.out.println(result);

	}

}
