package Assign___String_Sliding_Window;

import java.util.*;

public class Strings_Count_Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(substr(s));
	}

	public static int substr(String s) {
		String str = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				str = s.substring(i, j);
				boolean ans = isP(str, 0, str.length() - 1);
				if (ans) {
					count++;
				}
			}
			
		}
		return count;
	}

	public static boolean isP(String str, int i, int j) {
		while (i <= j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}

}
