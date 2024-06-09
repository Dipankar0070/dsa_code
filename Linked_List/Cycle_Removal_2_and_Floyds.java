package Linked_List;

import Linked_List.Cycle_Removal_1.Node;

public class Cycle_Removal_2_and_Floyds {
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
	public void createcycle() throws Exception {
		Node nn=getnode(2);
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
		int count=1;
		Node temp=meet;
		while(temp.next!=meet) {
			count++;
			temp=temp.next;
		}
		Node fast=head;
		Node slow=head;
		for(int i=0;i<count;i++) {
			fast=fast.next;
		}
		while(fast.next!=slow.next) {
			fast=fast.next;
			slow=slow.next;
		}
		fast.next=null;
		
	}
	public void removeByFloyd() {
		Node meet=hasCycle(head);
		
		if(meet==null) {
			return;
		}
		Node fast=meet;
		Node slow=head;
	
		while(fast.next!=slow.next) {
			fast=fast.next;
			slow=slow.next;
		}
		fast.next=null;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Cycle_Removal_2_and_Floyds cc=new Cycle_Removal_2_and_Floyds();
		cc.addlast(1);
		cc.addlast(2);
		cc.addlast(3);
		cc.addlast(4);
		cc.addlast(5);
		cc.addlast(6);
		cc.addlast(7);
		cc.addlast(8);
		
		cc.createcycle();
		cc.removeByFloyd();
		//cc.removecycle();
		cc.display();
		
		
		
		
	}
	}


