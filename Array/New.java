package Array;

import java.util.*;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Character> ll = new ArrayList<>();

	        // Add elements to the ArrayList
	        ll.add('a');
	        ll.add('b');
	        ll.add('c');

	        // Check if an element is present
	       
	     System.out.println(ll);
	     ll.remove(0);
	     System.out.println(ll);
	     String str="aabcde";
	    char  ch=str.charAt(3);
	    System.out.println(ch);
	     if ( ll.contains(ch)) {
				System.out.println(1111);
			}
	     System.out.println(ll.contains(ch));
	    }
	}
//		ArrayList<Character> charList = new ArrayList<>();
//		charList.add('A');
//		charList.add('B');
//		charList.add('C');
//
//		// Check if a character is present
//		char charToCheck = 'B';
//		if (charList.contains(charToCheck)) {
//			System.out.println(charToCheck + " is present in the ArrayList.");
//		} else {
//			System.out.println(charToCheck + " is not present in the ArrayList.");
//		}
//		System.out.println(charList);
//		String str = "AABCDE";
//		char ch = str.charAt(1);
//		System.out.println(ch);
//		if (! charList.contains(ch)) {
//			System.out.println(1111);
//		}
//	}
//}