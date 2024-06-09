package Lec_1;
import java.util.Scanner;
public class Max_of_3_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
	if(a>=b && a>=c) {
		System.out.print(a);
		System.out.println(" is greater");
	}
	else if(b>=a && b>=c) {
		System.out.print(b);
		System.out.println(" is greater");
	}
	else {
		System.out.print(c);
		System.out.println(" is greater");
	}
	}

}
