package Backtracking;

import java.util.*;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sudoku = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		sudo(sudoku, 0, 0);
	}

	public static void sudo(int[][] s, int row, int col) {
		if (col > 8) {
			col = 0;
			row++;
		}
		if (row == 9) {
			Print(s);
			return;
		}
		if (s[row][col] != 0) {
			sudo(s, row, col + 1);
		}

		else {
			for (int val = 1; val <= 9; val++) {
				if (isItSafe(s, row, col, val) == true) {
					s[row][col] = val;
					sudo(s, row, col + 1);
					s[row][col] = 0;
				}
			}
		}

	}

	public static boolean isItSafe(int[][] s, int row, int col, int val) {

		for (int z = 0; z < 9; z++) {
			if (s[row][z] == val) {
				return false;
			}
		}
		for (int z = 0; z < 9; z++) {
			if (s[z][col] == val) {
				return false;
			}
		}
		int cr = row - row % 3;
		int cc = col - col % 3;
		for (int i = cr; i < cr + 3; i++) {
			for (int j = cc; j < cc + 3; j++) {
				if (s[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}

	public static void Print(int[][] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[0].length; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
	}

}
