package Two_D__Array;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_matrix_ll_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;
		int count = 1;
		int total_element = arr.length * arr[0].length;
		while (count <= total_element) {
			for (int i = minCol; i <= maxCol && count <= total_element; i++) {
				arr[minRow][i] = count;
				count++;
			}
			minRow++;
			for (int i = minRow; i <= maxRow && count <= total_element; i++) {
				arr[i][maxCol] = count;
				count++;
			}
			maxCol--;
			for (int i = maxCol; i >= minCol && count <= total_element; i--) {
				arr[maxRow][i] = count;
				count++;
			}
			maxRow--;
			for (int i = maxRow; i >= minRow && count <= total_element; i--) {
				arr[i][minCol] = count;
				count++;
			}
			minCol++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+"	");
			}
			System.out.println();
		}
	}

}
