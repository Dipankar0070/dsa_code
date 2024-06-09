package DP;

import java.util.*;

public class Longest_Common_Subsequence_topDown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int[][] dp = new int[s1.length()][s2.length()];
		for (int[] i : dp) {
			Arrays.fill(i, -1);
		}
		System.out.println(lcs(s1, s2, 0, 0, dp));
	}

	public static int lcs(String s1, String s2, int i, int j, int[][] dp) {
		if (s1.length() == i || s2.length() == j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1, dp);
		} else {
			int left = lcs(s1, s2, i + 1, j, dp);
			int right = lcs(s1, s2, i, j + 1, dp);
			ans=Math.max(left, right);
		}
		return dp[i][j] = ans;
	}

}
