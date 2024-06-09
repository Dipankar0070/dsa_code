package Assign___String_Sliding_Window;
import java.util.*;
public class Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int max=0;
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				cnt++;
			}
			else {
				cnt=0;
			}
			max=Math.max(max, cnt);
		}
		System.out.println(max);
		
	}
	public static boolean isVowel(char ch) {
		if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}
		return false;
	}

}
