package Assign___String_Sliding_Window;
import java.util.*;
public class Strings_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		for(int i=0;i<str.length();i++) {
			int cn= ((int)str.charAt(i));
			if( cn> 90) {
				char ans=((char)(cn-32));
				s=s+ans;
				
			}
			else {
				char ans=((char)(cn+32));
				s=s+ans;
			}
			
		}
		System.out.println(s);
	}

}
