package Recursion;
import java.util.*;
public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		keypad(n,"");
	}
	static String[] code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void keypad(String n,String ans) {
		if(n.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=n.charAt(0);
		String press=code[ch-48];
		for(int i=0;i<press.length();i++) {
			keypad(n.substring(1),ans+press.charAt(i));
		}
	}
}


