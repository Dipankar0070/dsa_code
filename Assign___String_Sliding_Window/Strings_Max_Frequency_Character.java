package Assign___String_Sliding_Window;
import java.util.*;
public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(fun(s));
	}
	public static char fun(String s) {
		int max=0;
		char ans=0;
		for(int i=0;i<s.length()-1;i++) {
			int count=1;
			char fake=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(max<count) {
				max=count;
				ans=fake;
			}
		}
		return ans;
	}

}
