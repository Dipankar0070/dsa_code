package Backtracking;

import java.util.*;

public class N_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		nqueen(board, 0, n);
		System.out.println("No of solutions = " + count);

	}

	static int count = 0;

	public static void nqueen(int[][] board, int cr, int tq) {
		if (tq == 0) {
			print(board);
			count++;
			return;
		}

		for (int cc = 0; cc < board[0].length; cc++) {

			if (isItSafe(board, cr, cc) == true) {
				board[cr][cc] = 1;

				nqueen(board, cr + 1, tq - 1);
				board[cr][cc] = 0;
			}

		}

	}

	static boolean isItSafe(int[][] board, int cr, int cc) {
		int row = cr;
		int col = cc;
		while (col >= 0 && row >= 0) {
			if (board[row][col] == 1) {
				return false;

			}
			row--;
			col--;
		}
		row = cr;
		col = cc;
		while (row >= 0) {
			if (board[row][col] == 1) {
				return false;
			}
			row--;
		}
		row = cr;
		col = cc;
		while (col < board[0].length && row >= 0) {
			if (board[row][col] == 1) {
				return false;
			}
			row--;
			col++;
		}
		return true;
	}

	public static void print(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
