package Sliding_Windows;

import java.util.*;

public class Kartik_Bhaiya_and_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		System.out.println(fun(s, k));
	}

	public static int fun(String s, int k) {
		int a = changeA(s, k);
		int b = changeB(s, k);
		return (Math.max(a, b));
	}

	public static int changeA(String s, int k) {
		int idx = 0;
		int si = 0;
		int flip = 0;
		int ans = 0;
		while (idx < s.length()) {
			// growing
			if (s.charAt(idx) != 'a') {
				flip++;
			}
			// shrinking
			while (flip > k /* && si<=idx */) {
				if (s.charAt(si) != 'a') {
					flip--;
				}
				si++;

			}
			// ans calculation
			ans = Math.max(ans, idx - si + 1);
			idx++;
		}
		return ans;
	}

	public static int changeB(String s, int k) {
		int idx = 0;
		int si = 0;
		int flip = 0;
		int ans = 0;
		while (idx < s.length()) {
			if (s.charAt(idx) != 'b') {
				flip++;
			}
			while (flip > k/* && si<=idx */) {
				if (s.charAt(si) != 'b') {
					flip--;
				}
				si++;

			}
			ans = Math.max(ans, idx - si + 1);
			idx++;
		}
		return ans;
	}
}