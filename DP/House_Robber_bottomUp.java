package DP;
import java.util.*;
public class House_Robber_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(rob(arr));
		
	}
	public static int rob(int[]arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int [] dp=new int[arr.length];
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0],arr[1]);
		for(int i=2;i<dp.length;i++) {
			int robbed=arr[i]+dp[i-2];
			int notrobbed=dp[i-1];
			dp[i]=Math.max(robbed, notrobbed);
		}
		return dp[dp.length-1];
	}

}
