package DP;

import java.util.*;

public class Valentine_Magic_topDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int g = sc.nextInt();
		int[] boys = new int[b];
		int[] girls = new int[g];
		for (int i = 0; i < b; i++) {
			boys[i] = sc.nextInt();
		}
		for (int i = 0; i < g; i++) {
			girls[i] = sc.nextInt();
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
		int[][] dp = new int[boys.length][girls.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(vm(boys, girls, 0, 0, dp));
	}

	public static int vm(int[] boys, int[] girls, int i, int j, int[][] dp) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 10000000;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0;
		int exc = 0;
		inc = Math.abs(boys[i] - girls[j]) + vm(boys, girls, i + 1, j + 1, dp);
		exc = vm(boys, girls, i, j + 1, dp);
		return dp[i][j] = Math.min(inc, exc);
	}

}
