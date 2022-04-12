package com.leetcode.september.challenge;

public class FirstMissinPositive {

	public int firstMissingPositive(int[] nums) {

		// for empty array
		if (nums == null || nums.length < 1) {
			return 1;
		}

		final int n = nums.length;

		// in-place counting sort
		for (int i = 0; i < n; i++) {
			int elemPos = nums[i] - 1;
			if (elemPos == i) {
				continue; // element in correct position
			} else {
				// recursively put into correct position
				while (0 <= elemPos && elemPos < n) {
					swap(nums, i, elemPos);
					// if after swap, elemPos is still nums[i]-1, might get into infinite loop, test
					// case [1, 1]
					if (nums[i] - 1 == elemPos) {
						break;
					}

					elemPos = nums[i] - 1;
				}
			}
		}

		// iterate over "sorted" array to get first integer that is missing
		for (int i = 0; i < n; i++) {
			if (nums[i] - 1 != i) {
				return i + 1;
			}
		}
		return n + 1;
	}

	private void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] nums = { 7, 8, 9, 11, 12 };
		FirstMissinPositive firstMissinPositive = new FirstMissinPositive();
		int result = firstMissinPositive.firstMissingPositive(nums);
		System.out.println(result);

	}

}
