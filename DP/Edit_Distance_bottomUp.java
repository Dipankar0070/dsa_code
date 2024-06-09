package DP;

import java.util.*;

public class Edit_Distance_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(ed(s1, s2));
	}

	public static int ed(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for(int i=0;i<dp[0].length;i++) {
			dp[0][i]=i;
		}
		for(int i=0;i<dp.length;i++) {
			dp[i][0]=i;
		}
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.min(dp[i-1][j] ,Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
}
