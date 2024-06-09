package Set;

import java.util.*;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(20);
		set.add(2);
		set.add(-12);
		set.add(-20);
		set.add(20);
		set.add(50);
		set.add(28);
		System.out.println(set);
		System.out.println(set.contains(50));
		System.out.println(set.contains(3));
		System.out.println(set.remove(-20));
		System.out.println(set.remove(40));
		System.out.println(set);

		System.out.println();
		System.out.println();
		System.out.println();

		// tree set
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(20);
		set1.add(2);
		set1.add(-12);
		set1.add(-20);
		set1.add(20);
		set1.add(50);
		set1.add(28);
		System.out.println(set1);

		System.out.println();
		System.out.println();
		System.out.println();

		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(20);
		set2.add(2);
		set2.add(-12);
		set2.add(-20);
		set2.add(20);
		set2.add(50);
		set2.add(28);
		System.out.println(set2);
		for(int v:set2) {
			System.out.print(v+" ");
		}
		System.out.println();
		ArrayList<Integer> ll=new ArrayList<>(set2);
		System.out.println(ll);
	}

}
