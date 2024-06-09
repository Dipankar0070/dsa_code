package DP;

import java.util.*;

public class Minimum_Path_Sum_topDown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(PathSum(arr, 0, 0, dp));
	}

	public static int PathSum(int[][] arr, int cr, int cc, int[][] dp) {

		if (cr == arr.length - 1 && cc == arr[0].length - 1) {
			return arr[cr][cc];
		}

		if (cr >= arr.length || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}

		int down = PathSum(arr, cr + 1, cc, dp);
		int right = PathSum(arr, cr, cc + 1, dp);
		return dp[cr][cc] = Math.min(down, right) + arr[cr][cc];
	}

}
