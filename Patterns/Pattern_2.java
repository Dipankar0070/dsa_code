package Patterns;

import java.util.*;
import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Row = 1;
		int star = 1;
		while (Row <= n) {

			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			Row++;
			star++;
			System.out.println();
		}

	}

}
