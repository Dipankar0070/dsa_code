package Assign___String_Sliding_Window;

import java.util.*;

public class Form_Biggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			fun(arr, n);
			t--;
		}
	}

	public static void fun(int[] arr, int n) {
		String[] sarr = new String[n];
		for (int i = 0; i < n; i++) {
			String s = String.valueOf(arr[i]);
			sarr[i] = s;
		}
		fun2(sarr, n);
	}

	public static void fun2(String[] sarr, int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				// int diff = sarr[j].compareTo(sarr[j + 1]);
				int diff = comp(sarr, j);
				if (diff < 0) {
					String temp = sarr[j];
					sarr[j] = sarr[j + 1];
					sarr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(sarr[i]);
		}

	}

//	public static int comp(String sarr[], int j) {
//		String s1 = sarr[j];
//		String s2 = sarr[j + 1];
//
//		if (s1 == s2) {
//			return 0;
//		}
//		for (int k = 0; k < Math.min(s1.length(), s2.length()); k++) {
//			if (s1.charAt(k) != s2.charAt(k)) {
//				return s1.charAt(k) - s2.charAt(k);
//			}
//		}
////		int ret=ffuunn(s1,s2,Math.min(s1.length(),s2.length()));
////		if(ret==1) {
////			return s2.length()-s1.length();
////
////		}
//		return s2.length()-s1.length();
//	}
	public static int comp(String sarr[], int j) {
		String s1 = sarr[j];
		String s2 = sarr[j + 1];
		String ret=s1+s2;
		String ret2=s2+s1;
		return ret.compareTo(ret2);
		
		
	}

	public static int ffuunn(String s1, String s2, int m) {
		for (int v = m; v < s1.length(); v++) {
			if(s1.charAt(m)!=0) {
				return 0;
			}
		}
		for (int w = m; w < s2.length(); w++) {
			if(s2.charAt(m)!=0) {
				return 0;
			}
		}
		return 1;

	}

}
