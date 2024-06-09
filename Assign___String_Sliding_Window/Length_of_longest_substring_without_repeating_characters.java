package Assign___String_Sliding_Window;

import java.util.*;

public class Length_of_longest_substring_without_repeating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		fun(s);
	}

	public static void fun(String s) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int[] freq = new int[256];
	//	int ans1 = 0;
		while (ei < s.length()) {
			char ch = s.charAt(ei);
//			if(freq[ch]==0) {
//				count++;
//			}
			freq[ch]++;
			while (freq[ch] > 1 && si<ei) {
				char c = s.charAt(si);
				freq[c]--;
				si++;
			}
			ans = Math.max(ei - si + 1, ans);
			ei++;
		}
		System.out.println(ans);
	}

}
