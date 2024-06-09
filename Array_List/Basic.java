package Array_List;

import java.util.*;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(2, -6);
		System.out.println(ll);

		System.out.println(ll.get(1));
		ll.set(3, 999);
		System.out.println(ll);
		int ch=20;

		System.out.println(ll.contains(ch));
		ll.remove(2);
		System.out.println(ll);
		System.out.println();
//Collections.sort(ll);
//System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");

		}
		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");
		}
	}

}
