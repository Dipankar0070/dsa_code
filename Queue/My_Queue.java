package Queue;

public class My_Queue {
	protected int[] arr;
	protected int front = 0;
	private int size = 0;

	public My_Queue() {
		arr = new int[5];
	}

	public My_Queue(int n) {
		arr = new int[n];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == arr.length;
	}

	// for linear queue
	/*
	 * public void Enqueue(int item) throws Exception { 
	 * if(isFull()){ 
	 * throw new Exception("Queue full hai");
	 *   } 
	 *   int fps=front+size;  //fps=size nahi hoga kyonki dequeue ke baad size ghat jaayega.
	 *    arr[fps]=item;
	 * size++; }
	 */

	// for circular queue
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Queue full hai");
		}
		int fps = (front + size) % arr.length;
		arr[fps] = item;
		size++;
	}

	// linear queue
	/*
	 * public int Dequeue() {
	 *  int rv=arr[front];
	 *   front++; 
	 *   size--; 
	 *   return rv; }
	 */

	// circular queue
	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue khali hai");
		}
		int rv = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return rv;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue khali hai");
		}
		int rv = arr[front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			int ans = (front + i) % arr.length;
			System.out.print(arr[ans] + " ");
		}
		System.out.println();
	}
}
