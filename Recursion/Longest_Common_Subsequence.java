package Recursion;

import java.util.*;

public class Longest_Common_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(lcs(s1, s2, 0, 0));
	}

	public static int lcs(String s1, String s2, int i, int j) {
		if (s1.length() == i || s2.length() == j) {
			return 0;
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1);
		} else {
			int left = lcs(s1, s2, i + 1, j);
			int right = lcs(s1, s2, i, j + 1);
			return Math.max(left, right);
		}
		return ans;
	}

}
