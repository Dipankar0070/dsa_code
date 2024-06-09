package Backtracking;
import java.util.*;
public class Axis_Orbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MOHOINNI";
		String s2="NITIN";
		
		System.out.println(No_Of_Palindrome_Substring(s));
		System.out.println(No_Of_Palindrome_Substring(s2));
	}

	public static int No_Of_Palindrome_Substring(String s) {
		
		int count=0;
		//odd
		for(int axis=0; axis<s.length();axis++) {
				for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
					
					if(s.charAt(axis-orbit) == s.charAt(axis+orbit)) {
						count++;
					}
					else {
						break;
					}
				}
		}
		
		for(double axis=0.5;axis<s.length();axis++) {
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt((int)(axis-orbit))==s.charAt((int)(axis+orbit))){
					count++;
				}
				else {
					break;
				}
			}
		}
		
		return count;
		
		
}
}
