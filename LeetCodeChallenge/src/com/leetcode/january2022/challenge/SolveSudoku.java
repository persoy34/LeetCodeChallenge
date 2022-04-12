package com.leetcode.january2022.challenge;

import java.util.Arrays;

public class SolveSudoku {
	private static int GRID_SIZE = 9;

	public void solveSudoku(char[][] board) {
		solvedSudokuRec(board);
		for (int i=0; i<GRID_SIZE; i++) {
			System.out.println(Arrays.toString(board[i]));
		}
	}

	private boolean solvedSudokuRec(char[][] board) {
		for (int row = 0; row < GRID_SIZE; row++) {
			for (int column = 0; column < GRID_SIZE; column++) {
				if (board[row][column] == '.') {
					for (int numberToTry = 1; numberToTry <= 9; numberToTry++) {
						char chNumberToTry = (char) (numberToTry + '0');
						if (isValidPlacement(board, chNumberToTry, row, column)) {
							board[row][column] = chNumberToTry;
							if (solvedSudokuRec(board)) {
								return true;
							} else {
								board[row][column] = '.';
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isNumberInRow(char[][] board, char number, int row) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[row][i] == number) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumberInColumn(char[][] board, char number, int column) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[i][column] == number) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumberInBox(char[][] board, char number, int row, int column) {
		int localBoxRow = row - row % 3;
		int localBoxColumn = column - column % 3;

		for (int i = localBoxRow; i < localBoxRow + 3; i++) {
			for (int j = localBoxColumn; j < localBoxColumn + 3; j++)
				if (board[i][j] == number) {
					return true;
				}
		}
		return false;
	}

	private static boolean isValidPlacement(char[][] board, char number, int row, int column) {
		return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column)
				&& !isNumberInBox(board, number, row, column);
	}

	public static void main(String[] args) {
		char [][] board = {{'5','3','.','.','7','.','.','.','.'},
						   {'6','.','.','1','9','5','.','.','.'},
						   {'.','9','8','.','.','.','.','6','.'},
						   {'8','.','.','.','6','.','.','.','3'},
						   {'4','.','.','8','.','3','.','.','1'},
						   {'7','.','.','.','2','.','.','.','6'},
						   {'.','6','.','.','.','.','2','8','.'},
						   {'.','.','.','4','1','9','.','.','5'},
						   {'.','.','.','.','8','.','.','7','9'}};

		SolveSudoku solveSudoku = new SolveSudoku();
		solveSudoku.solveSudoku(board);
	}

}
