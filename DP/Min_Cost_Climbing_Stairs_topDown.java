package DP;
import java.util.*;
public class Min_Cost_Climbing_Stairs_topDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[]dp=new int[n];
		Arrays.fill(dp,-1);
		int zero=mincost(arr,0,dp);
		int one=mincost(arr,1,dp);
		System.out.println(Math.min(zero, one));
	}
	public static int mincost(int[] arr,int i,int[] dp) {
		
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int first=mincost(arr,i+1,dp);
		int sec=mincost(arr,i+2,dp);
		return dp[i]=Math.min(first, sec)+arr[i];
	}

}
