package Array;

import java.util.*;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		Bubble(arr);
	}

	public static void Bubble(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j < ar.length - i; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		for (int a = 0; a < ar.length; a++) {
			System.out.print(ar[a] + " ");
		}
	}
}
