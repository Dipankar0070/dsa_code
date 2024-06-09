package String;
import java.util.*;
public class Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int sum=1;
		
	for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)==str.charAt(i+1)) {
			sum++;
		}
		if(str.charAt(i)!=str.charAt(i+1)) {
			System.out.print(str.charAt(i)+""+sum);
			sum=1;
		}
	}
	System.out.print(str.charAt(str.length()-1)+""+sum);
	}

}