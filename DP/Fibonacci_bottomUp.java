package DP;
import java.util.*;
public class Fibonacci_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] dp=new int[n+1];
		System.out.println(fibo(n));
	}
	public static int fibo(int n) {
		
		int [] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
