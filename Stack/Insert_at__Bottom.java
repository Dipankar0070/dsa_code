package Stack;
import java.util.Stack;
public class Insert_at__Bottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		Insert_Data(st,-9);

	}
	public static void Insert_Data(Stack<Integer> st,int item) {
		Stack<Integer> st2=new Stack<>();
		int sz=st.size();
		for(int i=0;i<sz;i++) {
		st2.push(st.pop());
	}
		System.out.println(st2);
		
		st.push(item);
		
		int sz2=st2.size();
		for(int i=1;i<=sz2;i++) {
		st.push(st2.pop());
	}
		System.out.println(st);
		
		

}
}
