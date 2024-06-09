package Stack;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);

	}
	public static void reverse(Stack<Integer> st) {
		

		if(st.isEmpty()) {
			return;
		}
		int k=st.pop();
		reverse(st);
		Insert_Bottom(st,k);
		
	}
	public static void Insert_Bottom(Stack<Integer> st,int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		
		int k=st.pop();
		Insert_Bottom(st,item);
		st.push(k);
	
      	//System.out.println(st);
    	//System.out.println(st);
	}
	}
