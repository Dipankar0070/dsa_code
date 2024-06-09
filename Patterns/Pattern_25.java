package Patterns;

import java.util.*;

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int no = 1;
		int space = n - 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print(no + "\t");
				no++;
				j++;
			}
			row++;
			star += 2;
			space--;
			System.out.println();
		}
	}

}