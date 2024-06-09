package DP;

import java.util.*;

public class Distinct_Subsequence_topDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(ds(s, t, 0, 0, dp));
	}

	public static int ds(String s, String t, int i, int j, int[][] dp) {
		if(j==t.length()) {
			return 1;
		}
		if(i==s.length()) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int inc=0;
		int exc=0;
		
		if(s.charAt(i)==t.charAt(j)) {
			inc=ds(s,t,i+1,j+1,dp);
		}
		exc=ds(s,t,i+1,j,dp);
		return dp[i][j]=inc+exc;
	}
}
