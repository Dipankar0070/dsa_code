package Stack;

public class My_Stack {

	protected int[] arr;
	protected int top = -1;

	public My_Stack() {
		arr = new int[5];
	}

	public My_Stack(int n) {
		arr = new int[n];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Stack full hogya hai");
		}
		top++;
		arr[top] = item;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack khali hai");
		}
		int rv = arr[top]; // rv=return value
		top--;
		return rv;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack khali hai,peek not possible");
		}
		int rv = arr[top];
		return rv;
	}

	public int size() {
		int siz = top + 1;
		return siz;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
