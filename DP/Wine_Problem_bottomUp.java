package DP;
import java.util.*;
public class Wine_Problem_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine= {2, 3, 5, 1, 4};
		System.out.print(maxProfitBU(wine));
	}
public static int maxProfitBU(int[] arr) {
	int year=arr.length;
	int[][] dp=new int[arr.length][arr.length];
	
	for(int i=0;i<arr.length;i++) {
		dp[i][i]=arr[i]*year;
	}
	year--;
	
	for(int gap=1;gap<dp[0].length;gap++) {//anyway its a square matrix
		for(int j=gap;j<dp.length;j++) {
			int i=j-gap;
			int fs=arr[i]*year + dp[i+1][j];
			int ls=arr[j]*year + dp[i][j-1];
			dp[i][j]=Math.max(fs, ls);
		}
		year--;
	}
	return dp[0][arr.length-1];
}
}
