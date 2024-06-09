package Assign___String_Sliding_Window;

import java.util.*;

public class Non_Repeating_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			String str = sc.next();
		char ch=fun(str);
		if(ch==1) {
			System.out.println("-1");
		}
		else {
			System.out.println(ch);
		}
			t--;
		}
	}
	

	public static char fun(String str) {
	boolean ans=false;
		for(int i=0;i<str.length();i++) {
			char alp=str.charAt(i);
			if(i==str.length()-1) {
				ans=funl(alp,i,str);
			}
			else {
			ans=fun2(alp,i,str ) && funl(alp,i,str);
			}
			if(ans==true) {
				return alp;
			}
		}
		
		return 1;
		
	}
	public static boolean fun2(char alp,int i, String str) {
		for(int j=i+1;j<str.length();j++) {
			if(str.charAt(j)==alp) {
				return false;
			}
		}
		return true;
	}
	public static boolean funl(char alp,int i, String str) {
		for(int j=i-1;j>=0;j--) {
			if(str.charAt(j)==alp) {
				return false;
			}
		}
		return true;
	}
}
