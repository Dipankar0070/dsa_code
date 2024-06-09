package Assign___String_Sliding_Window;

import java.util.*;

public class Longest_K_Unique_Character_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			int k = sc.nextInt();
			System.out.println(sub(str, k));
		}
	}

	public static int sub(String str, int k) {
		if(k==0 || k>=str.length()) {
			return -1;
		}
		int si = 0;
		int ei = 0;
		int len = 0;
		int max = 0;
		ArrayList<Character> ll = new ArrayList<>();
		while (ei < str.length()) {
			char ch = str.charAt(ei);

			if (ll.contains(ch) == false) {
				len++;
			}
			ll.add(ch);

			//char del = ll.get(0);

			while (len > k) {
				char dell=ll.remove(0);
				si++;
				if (ll.get(0) != dell) {
					len--;
				}
			}

			max = Math.max(ei - si + 1, max);
			ei++;

		}
		if (max < k) {
			return -1;
		} else {
			return max;
		}
	}
}