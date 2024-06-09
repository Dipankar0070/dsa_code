package Two_D__Array;

import java.util.*;

public class Arrays_Wave_Print_Row_Wise {

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
		for (int i = 0; i < M; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				for (int j = N - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + ", ");

				}

			}

		}
		System.out.print("END");

	}
}
