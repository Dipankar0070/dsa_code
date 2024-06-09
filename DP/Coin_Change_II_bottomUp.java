package DP;
import java.util.*;
public class Coin_Change_II_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int amount=sc.nextInt();
		System.out.println(cc(arr, amount));
	}
	public static int cc(int[] coin, int amount) {
		int[][]dp=new int[coin.length+1][amount+1];
		for(int i=0;i<dp.length;i++) {
			dp[i][0]=1;
		}
		for(int c=1;c<dp.length;c++) {
			for(int am =0;am<dp[0].length;am++) {
				int inc=0;
				int exc=0;
				if(am>=coin[c-1]) {
					inc=dp[c][am-coin[c-1]];
					
				}
				exc=dp[c-1][am];
				dp[c][am]=inc+exc;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
}
