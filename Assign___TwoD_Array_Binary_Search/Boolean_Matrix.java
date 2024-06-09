package Assign___TwoD_Array_Binary_Search;
import java.util.*;
import java.util.Scanner;

public class Boolean_Matrix {

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
		int [][]ans=new int[M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				ans[i][j]=arr[i][j];
			}
		}
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(ans[i][j]==1) {
					arr=fun(arr,M,N,i,j);
				}
			}
		}
		
		for(int a=0;a<M;a++) {
			for(int b=0;b<N;b++) {
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] fun(int[][]ar,int M, int N,int i,int j){
		for(int q=0;q<M;q++) {
			ar[q][j]=1;
		}
		for(int w=0;w<N;w++) {
			ar[i][w]=1;
		}
		return ar;
		
	}

}
