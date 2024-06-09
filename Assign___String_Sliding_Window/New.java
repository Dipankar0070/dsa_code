package Assign___String_Sliding_Window;

import java.util.*;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n-1;
		int star = 1;
		while (row < 2*n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			row++;
			if(row>n) {
				space++;
				star--;
			}else {
			space --;
			star++;
			}
			System.out.println();
		}
	}

}
