package DP;
import java.util.*;
public class Min_Cost_Climbing_Stairs_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(mincost(arr));
	}
	public static int mincost(int[] arr) {
		int [] dp=new int[arr.length];
		dp[0]=arr[0];
		dp[1]=arr[1];
		for(int i=2;i<arr.length;i++) {
			dp[i]=Math.min(dp[i-1],dp[i-2])+arr[i];
		}
		return Math.min(dp[dp.length-2], dp[dp.length-1]);
	}

}
