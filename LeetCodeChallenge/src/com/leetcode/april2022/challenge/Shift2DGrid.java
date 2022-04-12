package com.leetcode.april2022.challenge;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    private int row;
    private int col;
	public List<List<Integer>> shiftGrid(int [][] grid, int k) {
		List<List<Integer>> result = new ArrayList<>();
		row = grid.length;
		col = grid[0].length;
		int [][] temp = new int[row] [col];
		for (int r=0; r < row; r++) {
			for (int c=0; c< col; c++) {
				int pos=(postToVal(r, c)+k) % (row * col) ;
				int [] newRolCol = valToPos(pos);
				temp[newRolCol[0]][newRolCol[1]]= grid[r][c];
			}
			
		}
		for (int i=0; i<row; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j=0; j< col; j++) {
				list.add(temp[i][j]);
			}
			result.add(list);
		}
		return result;
	}
	
	private int postToVal(int r, int c) {
		return r*col+c;
	}
	
	private int [] valToPos(int val) {
		int [] result = {val / col, val % col};
		return result;
	}

	public static void main(String[] args) {
		int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
		int k = 1;
		Shift2DGrid shift2dGrid = new Shift2DGrid();
		List<List<Integer>> result = shift2dGrid.shiftGrid(grid, k);
		for (List<Integer> list : result) {
			System.out.println(list);
		}
	}

}
