package Recursion;
import java.util.*;
public class Lexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0;
		int end=1000;
		lexo(start,end);
	}
	public static void lexo(int start,int end) {
		
		if(start>end) {
			return;
		}
		System.out.println(start);
		
		int i=0;
		if(start==0) {
			i=1;
		}
		for(;i<10;i++) {
		 
		
		lexo(start*10+i,end);
	}
		
	}

}
