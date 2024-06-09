package DP;
import java.util.*;
public class Minimum_falling_pathSum2_topDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int [][] arr= {{7}};
	        int[][] dp = new int[arr.length][arr[0].length];
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], Integer.MIN_VALUE);
			}
			for (int i = 0; i < arr[0].length; i++) {
				dp[0][i] = pathSum(arr, 0, i, dp);
			}
			System.out.println(smallestValue(dp[0]));
			
		}

		public static int pathSum(int[][] arr, int cr, int cc, int[][] dp) {
			
			if (cc < 0 || cc >= arr[0].length) {
				return Integer.MAX_VALUE;
			}

			
			if (cr == arr.length - 1) {
				return arr[cr][cc];
			}
					if (dp[cr][cc] != Integer.MIN_VALUE) {
				return dp[cr][cc];
			}
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<arr[0].length;i++){
	            if(i==cc){
	                continue;
	            }
	           int m= pathSum(arr,cr+1,i,dp);
	           min= Math.min(min,m);
	        }
			return dp[cr][cc]=min+arr[cr][cc];
		}

		public static int smallestValue(int[] dp) {
			int min=Integer.MAX_VALUE;
			for (int i = 0; i < dp.length; i++) {
				if(dp[i]<min) {
					min=dp[i];
				}
			}
			return min;
		}
	}
