package DP;

import java.util.*;

public class Edit_Distance_topDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int[][] dp = new int[s1.length()][s2.length()];
		for (int[] i : dp) {
			Arrays.fill(i, -1);
		}
		System.out.println(ed(s1, s2, 0, 0, dp));
	}

	public static int ed(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = ed(s1, s2, i + 1, j + 1, dp);
		} else {
			int delete = ed(s1, s2, i + 1, j, dp);
			int insert = ed(s1, s2, i, j + 1, dp);
			int replace = ed(s1, s2, i + 1, j + 1, dp);
			ans = Math.min(insert, Math.min(delete, replace)) + 1;
		}
		return dp[i][j] = ans;
	}

}
