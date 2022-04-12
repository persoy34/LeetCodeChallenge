package com.leetcode.january2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class SetMatixZeroes {

	public void setZeroes(int[][] matrix) {
		int rows= matrix.length;
		int cols= matrix[0].length;
		List<int []> list = new ArrayList<>();
		for (int i=0; i< rows; i++) {
			for (int j=0; j< cols; j++) {
				if (matrix[i][j]==0) {
					int [] rowCol= new int[2];
					rowCol[0]=i;
					rowCol[1]=j;
					list.add(rowCol);
				}
			}
		}
		if (!list.isEmpty()) {
			for (int[] rowCol : list) {
				int i = rowCol[0];
				int j = rowCol[1];
				while (i> -1) {
					matrix[i--][j]=0;
				}
				i=rowCol[0];
				while (i<rows) {
					matrix[i++][j]=0;
				}
				i=rowCol[0];
				while (j>-1) {
					matrix[i][j--]=0;
				}
				j=rowCol[1];
				while (j < cols) {
					matrix[i][j++]=0;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
