package Stack;

public class Dynamic_Stack extends My_Stack{
@Override
	public void push(int item) throws Exception {
	if(super.isFull()) {//this.isFull yaha use kr skte the kyunki is child class me koi sa bhi isFull naam ka method nahi hai
		int [] newarr=new int[2*arr.length];
		for(int i=0;i<arr.length;i++) {
			newarr[i]=arr[i];
		}
		arr=newarr;
	}
	//top++;
	//arr[top]=item;
	
	//line no 13 aur 14 nahi krenge kyunki 
	//My_Stack ka line no 28 aur 29 same hai to usko hi
	//inherit krenge.
	
	//this.push(item);
		//this keyword bhi yaha pr use nahi kr paayenge
	//kyonki this keyword pehle child class yaani Dynamic_Stack me check
	//krega uske baad parent class me jaayega.
	
	super.push(item);
	}
}
