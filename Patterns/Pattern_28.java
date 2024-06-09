package Patterns;
import java.util.*;
public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
			System.out.print("\t");
			i++;
			}
			int j=1;
			int val=row;
			while(j<=star) {
				
				System.out.print(val+"\t");
				if(j>=row) {
					val--;
				}
				else {
					val++;
				}
				j++;
		
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}
