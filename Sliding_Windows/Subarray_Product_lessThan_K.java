package Sliding_Windows;

import java.util.*;

public class Subarray_Product_lessThan_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(countarr(arr, k));
	}

	public static int countarr(int[] arr, int k) {

		int count = 0;
		int i = 0;
		int si = 0;
		int prod = 1;
		while (i < arr.length) {
			prod = prod * arr[i];

			while (prod >= k && si < i) {
				prod = prod / arr[si];
				si++;
			}
			count = count + (i - si + 1);

			i++;
		}
		return count;
	}

}