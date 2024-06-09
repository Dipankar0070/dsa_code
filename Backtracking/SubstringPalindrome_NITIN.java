package Backtracking;
import java.util.*;
public class SubstringPalindrome_NITIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="NITIN";
		sub(word,"");
	}
	public static void sub(String wrd,String ans) {
		if(wrd.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=wrd.length();i++) {
		String s=wrd.substring(0,i);
		if(isPalindrome(s)==true) {
		sub(wrd.substring(i),ans+s+"/");
		}
		}
		
	}
	public static boolean isPalindrome(String s) {
	   int i=0;
	   int j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
			return true;
			
		
		
	}

}