package Recursion;
import java.util.*;
public class Coin_Toss_no_HH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		coin(n,"");
	}
	
	public static void coin(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			
			return ;
		}
		if(ans.length()==0 || ans.charAt(ans.length() -1)!='H') {
		coin(n-1,ans+"H");
		}
		coin(n-1,ans+"T");
		//return a+b;
		
	}

}
