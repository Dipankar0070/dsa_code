package DP;
import java.util.*;
public class Distinct_Subsequence_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(ds(s,t));
	}
	public static int ds(String s, String t) {
		int[][]dp=new int[s.length()+1][t.length()+1];
		for(int i=0;i<dp.length;i++) {
			dp[i][0]=1;
		}
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				int inc=0;
				int exc=0;
				if(s.charAt(i-1)==t.charAt(j-1)) {
					inc=dp[i-1][j-1];
				}
				exc=dp[i-1][j];
				dp[i][j]=inc+exc;
			}
		}
	
		return dp[dp.length-1][dp[0].length-1];
	}

}
