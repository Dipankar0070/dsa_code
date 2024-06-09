package Lec_1;

import java.util.*;

public class Can_Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Can vote");
		}
		else {
			System.out.println("Can't Vote");
		}
	}

}
