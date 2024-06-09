package Assign___String_Sliding_Window;

import java.util.*;

public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i==0 && (int) ch<96) {
				System.out.print(ch);
			}
			else if((int) ch>96) {
				System.out.print(ch);
			}
			else {
				System.out.println();
				System.out.print(ch);
			}
		}
	}

}
