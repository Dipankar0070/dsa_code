package Recursion;

import java.util.*;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		BP(n, 0, "");
		System.out.println("No of paths = " + count);
		System.out.println(length);
	}

	static int count = 0;
	static int length=Integer.MAX_VALUE;
	public static void BP(int n, int current, String ans) {
		if (current == n) {
			System.out.println(ans);
			length=Math.min(length,ans.length());
			count++;
			return;
		}
		if (current > n) {
			return;
		}

		BP(n, current + 1, ans + 1);
		BP(n, current + 2, ans + 2);
		BP(n, current + 3, ans + 3);
	}

}
