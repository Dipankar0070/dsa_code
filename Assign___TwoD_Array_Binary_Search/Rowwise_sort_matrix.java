package Assign___TwoD_Array_Binary_Search;

import java.util.Scanner;
import java.util.*;
public class Rowwise_sort_matrix {

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
		int [][] ans=new int[M][N];
		for(int i=0;i<M;i++) {
			int [] arr1=new int[N];
			for(int j=0;j<N;j++) {
				arr1[j]=arr[i][j];
			}
			int[] sort=Selection(arr1);
			for(int k=0;k<N;k++) {
				ans[i][k]=sort[k];
			}
		}
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static int[] Selection(int[] ar) {
		 for(int i=0;i<ar.length;i++) {
			 int min=i;
			 for(int j=i+1;j<ar.length;j++) {
				 if(ar[min]>ar[j]) {
					 min=j;
				 }
			 }
			 int temp=ar[i];
			 ar[i]=ar[min];
			 ar[min]=temp;	
			 
		 }
		 return ar;

}
}
