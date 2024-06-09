package Recursion;

import java.util.*;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seq = "abc";
		subseq(seq, "");
		System.out.println(count);

	}

	static int count = 0;

	public static void subseq(String seq, String ans) {
		if (seq.length() == 0) {
			System.out.println(ans);
			count++;

			return;

		}

		char ch = seq.charAt(0);
		subseq(seq.substring(1), ans);
		subseq(seq.substring(1), ans + ch);
	}

}
