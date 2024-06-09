package Assign___TwoD_Array_Binary_Search;

import java.util.*;

public class Rotate_Image {

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

		
		for(int i=M-1;i>=0;i--) {
			for(int j=0;j<M;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
