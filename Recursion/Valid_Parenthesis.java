package Recursion;
import java.util.*;
public class Valid_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		paren(n,0,0,"");
	}
	public static void paren(int n,int openBrac,int closeBrac, String ans ) {
		if(closeBrac==n && openBrac==n) {
			System.out.println(ans);
			 return;
		}
		if(openBrac<n) {
			paren(n,openBrac+1,closeBrac,ans+'(');
		}
		if(openBrac>closeBrac) {
			paren(n,openBrac,closeBrac+1,ans+')');
		}
	}

}
