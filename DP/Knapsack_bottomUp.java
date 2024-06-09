package DP;

import java.util.*;

public class Knapsack_bottomUp {

	
	
//	.
//	.
//	.
//	.
//	.                      wrong wrong wrong wrong 
//	.
//	.
//	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] weight = { 1, 2, 3, 2, 2 };
		int[] value = { 8, 4, 0, 5, 3 };
		int capacity = 4;
		System.out.println(maxval(weight, value, capacity));
	}

	public static int maxval(int[] wt, int[] val, int cap) {
		int[][] dp = new int[wt.length + 1][cap + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int inc = 0;
				int exc = 0;
				if (j >= wt[i - 1]) {
					inc = val[i - 1] + dp[i - 1][j - wt[i - 1]];
				}
				exc = dp[i - 1][j];
				dp[i][cap] = Math.max(inc, exc);
			}
		}
		for (int k = 0; k <dp.length; k++) {
			for (int y = 0; y < dp[0].length; y++) {
				System.out.print(dp[k][y] + " ");
			}
			System.out.println();
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

}
