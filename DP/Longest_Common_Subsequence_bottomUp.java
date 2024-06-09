package DP;
import java.util.*;
public class Longest_Common_Subsequence_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(lcs(s1,s2));
	}
	public static int lcs(String s1, String s2) {
		int [][] dp=new int[s1.length()+1][s2.length()+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				int ans=0;
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
					
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
				//dp[i][j]=ans;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
}
