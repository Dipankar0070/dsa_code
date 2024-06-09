package Patterns;
import java.util.*;

public class Pattern_lec2_02_04_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=2*n-2;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("_ ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			space-=2;
			star++;
			System.out.println();
		}
	}

}
