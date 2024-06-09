package Stack;
//import java.util.My_Stack;
public class My_Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	My_Stack st=new My_Stack();

		My_Stack st=new My_Stack(3);
		
		st.push(10);
		st.push(20);
		st.push(30);
		//st.push(40);
		//st.push(50);
		//System.out.println(st.isFull());
		//System.out.println(st);
		//st.push(60);
	//	System.out.println(st.pop());
		
		System.out.println(st.peek());
		System.out.println(st.size());
		st.display();
	}

}
