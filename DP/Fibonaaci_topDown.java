package DP;
import java.util.*;
public class Fibonaaci_topDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] dp=new int[n+1];
		System.out.println(fibo(n,dp));
	}
	public static int fibo(int n,int[]dp) {
		if(n==0|| n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int f1=fibo(n-1,dp);
		int f2=fibo(n-2,dp);
		 return dp[n]=f1+f2;
	}

}
