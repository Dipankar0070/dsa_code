package DP;

import java.util.*;

public class Coin_Change_II_topDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int amount=sc.nextInt();
		int[][]dp=new int[arr.length][amount];
		for(int[] a:dp) {
			Arrays.fill(a,-1);
		}
		System.out.println(cc(arr, amount, 0,dp));
	}

	public static int cc(int[] arr, int amount, int i,int[][] dp) {
		if(amount==0) {
			return 1;
		}
		if(i==arr.length) {
			return 0;
		}
		if(dp[i][amount-1]!= -1) {
			return dp[i][amount-1];
		}
		int inclusion = 0;
		int exclusion = 0;

		if (amount >= arr[i]) {
			inclusion = cc(arr, amount - arr[i], i,dp);
		}
		exclusion = cc(arr, amount, i + 1,dp);
		return dp[i][amount-1]=inclusion + exclusion;
	}

}
