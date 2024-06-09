package Recursion;

import java.util.*;

public class Coin_Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arrsize = sc.nextInt();
		int[] arr = new int[arrsize];
		for(int i=0;i<arrsize;i++) {
			arr[i]=sc.nextInt();
		}
		BP(n, 0, "", arr);
//		if(length==Integer.MAX_VALUE) {
//			System.out.println(-1);
//		}
//		else {
			System.out.println(length);

		//}
	}

	static int length = Integer.MAX_VALUE;

	public static int BP(int n, int current, String ans, int[] arr) {
		if (current == n) {
			length = Math.min(length, ans.length());
			return length;
		}
		if (current > n) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			BP(n, current + arr[i], ans + arr[i], arr);
		}
		
		return length;
	}

}
