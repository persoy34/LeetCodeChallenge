package com.leetcode.april2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

	public int calPoints(String[] ops) {
		List<Integer> list = new ArrayList<>(); 
		for (int i=0; i<ops.length; i++) {
			try {
				int val = Integer.valueOf(ops[i].trim());
				list.add(val);
			} catch (Exception e) {
				int index = list.size()-1;
				if (ops[i].trim().equals("D")) {
					int val = list.get(index);
					list.add(val *2);
				} else if (ops[i].trim().equals("C")) {
					list.remove(index);
				} else if (ops[i].trim().equals("+")) {
					int val1= list.get(index);
					int val2 = list.get(index-1);
					list.add(val1+val2);
				}
			}
		}
		int total=0;
		for (int i: list) {
			total+=i;
		}
		return total;
	}

	public static void main(String[] args) {
		String [] ops = {"5","-2","4","C","D","9","+","+"};
		BaseballGame baseballGame = new BaseballGame();
		int total = baseballGame.calPoints(ops);
		System.out.println(total);

	}

}
