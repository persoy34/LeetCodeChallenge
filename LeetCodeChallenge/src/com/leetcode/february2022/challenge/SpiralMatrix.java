package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List <Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		if (matrix == null || matrix.length == 0)
			return result;
		
		int top = 0;
		int bottom = matrix.length -1;
		int left =0;
		int right = matrix[0].length-1;
		int size = matrix.length * matrix[0].length;
		while (result.size() < size) {
			for (int i=left; i<=right && result.size() < size; i++) {
				result.add(matrix[top][i]);
			}
			top+=1;
			for (int i=top; i<=bottom && result.size() < size; i++) {
				result.add(matrix[i][right]);
			}
			right-=1;
			
			for (int i=right; i>=left && result.size() < size; i--) {
				result.add(matrix[bottom][i]);
			}
			bottom-=1;
			for (int i=bottom; i>=top && result.size() < size; i--) {
				result.add(matrix[i][left]);
			}
			left+=1;
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		List<Integer> result = spiralMatrix.spiralOrder(matrix);
		System.out.println(result);
	}

}
