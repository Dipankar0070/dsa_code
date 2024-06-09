package Backtracking;
import java.util.*;
public class Substring_NITIN_partition {

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
		sub(wrd.substring(i),ans+wrd.substring(0,i)+"/");
		}
	}

}
