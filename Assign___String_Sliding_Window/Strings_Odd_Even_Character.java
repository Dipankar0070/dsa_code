package Assign___String_Sliding_Window;
import java.util.*;
public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				char ch=str.charAt(i);
				int cn=((int)(ch));
				cn++;
				char cng=((char)(cn));
				s=s+cng;
			}
			else {
				char ch=str.charAt(i);
				int cn=((int)(ch));
				cn--;
				char cng=((char)(cn));
				s=s+cng;
			}
		}
		System.out.println(s);
	}

}
