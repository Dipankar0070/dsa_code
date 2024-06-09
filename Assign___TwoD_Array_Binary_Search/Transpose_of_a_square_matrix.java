package Assign___TwoD_Array_Binary_Search;

import java.util.Scanner;

public class Transpose_of_a_square_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int[][] arr = new int[M][M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int[][] transpose = new int[M][M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {  
				transpose[j][i] = arr[i][j];
			}

		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}
}
