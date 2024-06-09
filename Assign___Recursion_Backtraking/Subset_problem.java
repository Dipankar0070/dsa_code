package Assign___Recursion_Backtraking;

import java.util.*;

public class Subset_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(fun(n, arr, target, 0, "", 0,0));
	}

	public static int fun(int n, int[] arr, int t, int sum, String s, int count,int i) {
		if (sum == t) {
			System.out.println(s);
			count++;
			return count;
		}
		fun(n,arr,t,sum+arr[i],s+arr[i],count,i+1);
	}

}
