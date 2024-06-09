package DP;
import java.util.*;
public class House_Robber_topDown_Backward {

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
		System.out.println(rob(arr,n-1,dp));
		
	}
	
	public static int rob(int[] arr,int i,int[] dp) {
		if(i<0){
			return 0;
		}
		if(dp[i]!=-1) {
		return dp[i];
		}
		int robbed=arr[i]+rob(arr,i-2,dp);
		int notrobbed=rob(arr,i-1,dp);
		return dp[i]=Math.max(robbed, notrobbed);
	}

}
