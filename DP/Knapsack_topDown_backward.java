package DP;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Knapsack_topDown_backward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] weight = { 1, 2, 3, 2, 2 };
		int[] value = { 8, 4, 0, 5, 3 };
		int capacity = 4;
		int[][] dp = new int[weight.length][capacity];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(maxval(capacity, weight, value, weight.length-1, dp));
		for (int k = 0; k < weight.length; k++) {
			for (int y = 0; y < capacity; y++) {
				System.out.print(dp[k][y] + " ");
			}
			System.out.println();
		}
	}

	public static int maxval(int capacity, int[] weight, int[] value, int i, int[][] dp) {
		if (i <0 || capacity == 0) {
			return 0;
		}

		if (dp[i][capacity - 1] != -1) {
			return dp[i][capacity - 1];
		}
		int inc = 0;
		int exc = 0;
		if (capacity >= weight[i]) {
			inc = value[i] + maxval(capacity - weight[i], weight, value, i - 1, dp);
		}
		exc = maxval(capacity, weight, value, i - 1, dp);

		return dp[i][capacity - 1] = Math.max(inc, exc);

	}

}
