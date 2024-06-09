package Assign___TwoD_Array_Binary_Search;

import java.util.*;

public class Piyush_and_Magical_Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int S = sc.nextInt();

		char[][] arr = new char[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j]=='*') {
					
				}
				else if(arr[i][j]=='#') {
					
				}
				else if(arr[i][j]=='.'){
					if(arr[i][j-1] || arr[][j])
				}
			}
		}
		

	}

}
