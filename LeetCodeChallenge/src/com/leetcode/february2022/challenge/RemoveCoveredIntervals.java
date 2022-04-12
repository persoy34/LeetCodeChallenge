package com.leetcode.february2022.challenge;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveCoveredIntervals {

	public static int removeCoveredIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
		LinkedList<int[]> list = new LinkedList<>();
		for (int[] interval : intervals) {
			if (!list.isEmpty() && list.getLast()[1] >= interval[1] && list.getLast()[0] <= interval[0]) {
				list.getLast()[0] = Math.min(list.getLast()[0], interval[0]);
				list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
			} else {
				list.add(interval);
			}
		}
		return list.size();
	}

	public static void main(String[] args) {
		int[][] intervals = { { 66672, 75156 }, { 59890, 65654 }, { 92950, 95965 }, { 9103, 31953 }, { 54869, 69855 },
				{ 33272, 92693 }, { 52631, 65356 }, { 43332, 89722 }, { 4218, 57729 }, { 20993, 92876 } };
//		int [][]intervals = {{1,2},{1,4},{3,4}};
		int count = removeCoveredIntervals(intervals);
		System.out.println(count);

	}

}
