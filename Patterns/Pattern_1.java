package Patterns;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Row = 1;
		int star = n;
		while (Row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("*   ");
				// System.out.print("\n");
				i++;
			}
			System.out.println();
			Row++;

		}
	}

}
