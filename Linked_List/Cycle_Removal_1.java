package Linked_List;

//import Linked_List.Linked_List_Cycle.ListNode;
//import Linked_List.My_Linked_List.Node;

//import Linked_List.My_Linked_List.Node;

public class Cycle_Removal_1 {
	public class Node {
		int val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	public void addfirst(int item) {
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
	public void addlast(int item) {

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
	public void createcycle(int idx) throws Exception {
		Node nn=getnode(idx);
		tail.next=nn;
	}
	
	public Node hasCycle(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return fast;
			}
		}
		return null;
	}
	
	public void removecycle() {
		Node meet=hasCycle(head);
		if(meet==null) {
			return;
		}
		Node start=head;
		while(start!=null) {
			Node temp=meet;

			while(temp.next!=meet) {//as temp started from meet.
				if(temp.next==start) {
					temp.next=null;
					return;
				}
				temp=temp.next;
			}
			start=start.next;
		}
	}

	

	public static void main(String[] args) throws Exception {
		Cycle_Removal_1 cl = new Cycle_Removal_1();
		cl.addlast(10);
		cl.addlast(20);
		cl.addlast(30);
		cl.addlast(40);
		cl.addlast(50);
		cl.addlast(60);
		cl.addlast(70);
		cl.addlast(80);
	//	cl.display(); 
		
		cl.createcycle(2);
		
	//	cl.removecycle();

		cl.display();
		
		
		
	}

}
