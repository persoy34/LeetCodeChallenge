package com.leetcode.march2022.challenge;

public class DetermineColorOfAChessboardSquare {

	public static boolean squareIsWhite(String coordinates) {
		return ((coordinates.charAt(0) -'a') + (coordinates.charAt(1) -'0')) % 2 ==0; 
	}

	public static void main(String[] args) {
		boolean result = squareIsWhite("c7");
		System.out.println(result);
	}

}
