package Patterns;
import java.util.*;
public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=2*n-3;
		int star=1;
		int star2=1;
		while(row<=n) {
			int k=1;
			while(k<=star2) {
				System.out.print("*  ");
				k++;
			}
			int i=1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			int j=1;
			if(row==n) {
				j=2;
			}
			while(j<=star) {
				System.out.print("*  ");
				
					j++;
			
			}
			row++;
			star=star+1;
			space=space-2;
			
			star2++;
			System.out.println();
		}
	}

}
