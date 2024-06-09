package OOPS_2;



public class Linked_List_Genrics<T> {
	public class Node {
		T val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;
//O(1)
	public void addfirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println(".");
	}
//O(1)
	public void addlast(T item) {

		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	private Node getnode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("K negative ya size se bara hai");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

//O(N)
	public void addatindex(T item, int k) throws Exception {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node nn = new Node();
			Node k_1th = getnode(k - 1);

			nn.val = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}
//O(1)
	public T getfirst() throws Exception {
		if (head == null) {
			throw new Exception("list khali hai");
		}
		return head.val;
	}
//O(1)
	public T getlast() throws Exception {
		if (head == null) { // ya tail==null
			throw new Exception("list khali hai");
		}
		return tail.val;
	}
//O(N)
	public T getatindex(int k) throws Exception {
		// Node kth=getnode(k);
		// return kth.val;
		return getnode(k).val;
	}
	//O(1)
	public T removefirst(){
		Node temp=head;
		if(size==1) {
			head=null;
			tail=null;
		}
		else {
		head=temp.next;//ya head.next
		temp.next=null;
		
		}
		size--;
		return temp.val;
	}
	public T removelast() throws Exception {
		Node temp=tail;////as we have to return the val of deleted element.
		if (size==1) {
		return	removefirst();
		}
		else {
			Node secondlast=getnode(size-2);
			temp=tail;
			tail=secondlast;
			secondlast.next=null;//ya tail.next
			size--;
			return temp.val;

		}
		
	}
	public T removeatindex(int k) throws Exception {
		if(k==0) {
		return removefirst();
		}
		else if (k==size-1) {
		return	removelast();
		}
		else {

	//	Node kth=getnode(k);

		Node k_1th=getnode(k-1);
		Node kth=k_1th.next; //ya getnode(k)
		k_1th.next=kth.next;
		kth.next=null;
		size--;
		return kth.val;
		
		
	}
		
	
}
}


