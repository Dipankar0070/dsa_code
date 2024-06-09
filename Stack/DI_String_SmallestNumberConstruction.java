package Stack;
import java.util.*;
public class DI_String_SmallestNumberConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "IIIDIDDD";
		//String s="IDIDI";
		DI(s);
	}
	public static void DI(String s) {
		int []arr=new int[s.length()+1];
		int c=1;
		Stack<Integer> st=new Stack<>();
			for(int i=0;i<s.length();i++) {
			st.push(i);
			if(s.charAt(i)=='I') {
			while(!st.isEmpty()) {
				arr[st.pop()]=c;
				c++;
			}	
		}
		}
		arr[arr.length-1]=c;
		c++;
		while(!st.isEmpty()) {
			arr[st.pop()]=c;
			c++;
		}
		
		
	/*
	 *Monu bhaiya ka code-
	 * 
	 * 	for(int i=0;i<=s.length();i++) {
			if(i==arr.length-1 || s.charAt(i)=='I' ) {
				arr[i]=c;
				c++;
				while(!st.isEmpty()) {
					arr[st.pop()]=c;
					c++;
				}
			}
			else {
				st.push(i);
			}
		}*/
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
