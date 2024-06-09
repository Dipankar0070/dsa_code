package DP;
import java.util.*;
public class Uncrossed_Lines_bottomUp {

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
		System.out.println(ul(arr1,arr2));

	}
	public static int ul(int[] s1, int[] s2) {
		int [][] dp=new int[s1.length+1][s2.length+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				//int ans=0;
				if(s1[i-1]==s2[j-1]) {
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



