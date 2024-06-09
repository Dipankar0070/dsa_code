package Recursion;
import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String que="abc";
		permu(que,"");
	}
public static void permu(String que,String ans) {
	if(que.length()==0) {
		System.out.println(ans);
		return;
	}
	
	for(int i=0;i<=que.length()-1;i++) {
		char ch= que.charAt(i);
	permu(que.substring(0,i)+que.substring(i+1),ans+ch);
}
}

}
