package Assign___String_Sliding_Window;
import java.util.*;
public class Strings_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		for(int i=0;i<str.length()-1;i++) {
			char ch=str.charAt(i);
			char ci=str.charAt(i+1);
			s=fun(s,ch,ci,i);
		}
		System.out.println(s);
	}
	public static String fun(String s,char ch,char ci,int i) {
		int chh=((int)(ch));
		int cii=((int)(ci));
		
		int diff=cii-chh;
		if(i==0) {
		s=s+ch+diff+ci;
		}
		else {
			s=s+diff+ci;
		}
		return s;
	}

}
