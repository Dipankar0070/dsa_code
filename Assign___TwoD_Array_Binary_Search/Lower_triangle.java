package Assign___TwoD_Array_Binary_Search;

import java.util.Scanner;

public class Lower_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int[][] arr = new int[M][M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j <M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		ans(arr,M);
	}
		public static void ans(int[][] arr,int M) {

		for(int i=1;i<M;i++) {
			for(int j=0;j<i;j++) {
				arr[i][j]=0;
				}
			}
			
		for(int i=0;i<M;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(arr[i][j]+" ");			
				}
			System.out.println();

		}
		//System.out.println();
		
	}

}
