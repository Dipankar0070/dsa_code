package String;
import java.util.*;
public class Substring_l {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int length=1;length<=s.length();length++) {
			for(int j=length;j<=s.length();j++) {
				int i=j-length;
				s.substring(i,j);
			}
		}
	}

}
