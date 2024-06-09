package Assign___String_Sliding_Window;
import java.util.*;
public class Strings_isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0;
		int j=str.length()-1;
		System.out.println(chk(i,j,str));
	}
		public static boolean chk(int i,int j,String str) {
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
