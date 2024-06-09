
//   Tail-recursion method




package Recursion;
import java.util.*;
public class Factorial_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n,1));
	}
	public static int fact(int n, int ans) {
		if(n==0) {
			return ans;
		}
		
		
		int fn=fact(n-1,ans*n);
		return fn;
	}

}
