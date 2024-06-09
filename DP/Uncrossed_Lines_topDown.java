package DP;

import java.util.*;

public class Uncrossed_Lines_topDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}
		int[][] dp = new int[arr1.length][arr2.length];
		for (int[] i : dp) {
			Arrays.fill(i, -1);
		}
		System.out.println(ul(arr1, arr2, 0, 0, dp));
	}

	public static int ul(int[] arr1, int[] arr2, int i, int j, int[][] dp) {
		if (arr1.length == i || arr2.length == j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (arr1[i] == arr2[j]) {
			ans = 1 + ul(arr1, arr2, i + 1, j + 1, dp);
		} else {
			int left = ul(arr1, arr2, i + 1, j, dp);
			int right = ul(arr1, arr2, i, j + 1, dp);
			ans = Math.max(left, right);
		}
		return dp[i][j] = ans;
	}

}
