package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {

	public static int leastInterval(char[] tasks, int n) {
		if(n==0) {
            return tasks.length;
        }
		Map<Character, Integer> tasksMap = new HashMap<>();
		// Set the priority queue decreasing order
		PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
		// Fill the task map
		for (char c : tasks) {
			tasksMap.put(c, tasksMap.getOrDefault(c, 0) + 1);
		}
		heap.addAll(tasksMap.values());
		int taskCycles = 0;
		while (!heap.isEmpty()) {
			List<Integer> task = new ArrayList<>();
			for (int i = 0; i <= n; i++) {
				if (!heap.isEmpty()) {
					task.add(heap.poll());
				}
			}
			for (int t : task) {
				if (--t > 0) {
					heap.add(t);
				}
			}
			taskCycles += heap.isEmpty() ? task.size() : n + 1;
		}
		return taskCycles;

	}

	public static void main(String[] args) {
		char[] tasks = { 'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		int n = 2;
		int result = leastInterval(tasks, n);
		System.out.println(result);

	}

}
