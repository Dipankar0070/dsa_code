package Assign___TwoD_Array_Binary_Search;

import java.util.*;
import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] arr = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;
		int count = 0;
		int total_element = arr.length * arr[0].length;
		while (count < total_element) {
			for (int i = minRow; i <= maxRow && count < total_element; i++) {
				System.out.print(arr[i][minCol]+", ");
				count++;
			}
			minCol++;
			for (int i = minCol; i <= maxCol && count < total_element; i++) {
				System.out.print(arr[maxRow][i]+", ");
				count++;
			}
			maxRow--;
			for (int i = maxRow; i >= minRow && count < total_element; i--) {
				System.out.print(arr[i][maxCol]+", ");
				count++;
			}
			maxCol--;
			for (int i = maxCol; i >= minCol && count < total_element; i--) {
				System.out.print(arr[minRow][i]+", ");
				count++;
			}
			minRow++;
		}
		System.out.print("END");

	}

}
