package com.leetcode.march2022.challenge;

import java.util.Arrays;

public class BoatsToSavePeople {

	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int lowIndex=0;
		int highIndex= people.length -1;
		int count =0;
		while (lowIndex < highIndex) {
			if (people[lowIndex]+people[highIndex] <= limit) {
				lowIndex++;
				highIndex--;
			} else {
				highIndex--;
			}
			count++;
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
