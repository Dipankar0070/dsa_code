package Assign_Stack_Queue_Linked_List;

import java.util.*;

public class Dequeue_efficient_queue_using_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		Stack<Integer> st2 = new Stack<>();

		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			q.add(i);
		}
		while (!q.isEmpty()) {
			st.push(q.poll());
		}
		while (!st.isEmpty()) {
			st2.push(st.pop());
		}
//		System.out.println(st2);
//		System.out.println(st2.pop());
		while(!st2.isEmpty()) {
			System.out.print(st2.pop()+" ");
//			q.add(st2.pop());
		}
//		System.out.println(q);
	}

}
