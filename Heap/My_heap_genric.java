package Heap;

import java.util.*;

public class My_heap_genric<T extends Comparable<T>> {
	ArrayList<T> list = new ArrayList<>();

	// add
	public void add(T item) {
		list.add(item);

		upheapify(list.size() - 1);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
//list.get(pi) > list.get(ci)
		if (islarger(list.get(pi) , list.get(ci))>0) {
			Swap(pi, ci);
			// ci=pi
			upheapify(pi);
		}

	}// remove (top)

	public T remove() {
		Swap(0, list.size() - 1);
		T rv = list.remove(list.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int lc = 2 * pi + 1;
		int rc = 2 * pi + 2;
		int min = pi;
		/*
		 * if(lc>list.size() || rc>list.size()) { return; }
		 */
		if (lc<list.size() && islarger(list.get(min) , list.get(lc))>0) {
			min = lc;
		}
		if (rc<list.size() && islarger(list.get(min) , list.get(rc))>0) {
			min=rc;
		}
		if(min!=pi) {
			Swap(min,pi);
			downheapify(min);
		}
	}

	// size
	public int size() {
		return list.size();
	}

	// min
	public T min() {
		return list.get(0);
	}

	private void Swap(int pith, int cith) {
		T ii = list.get(pith);
		T jj = list.get(cith);
		list.set(pith, jj);
		list.set(cith, ii);
	}
	//display
	public void display() {
		System.out.println(list);
	}
	public int islarger(T o1,T o2) {
		return o1.compareTo(o2);
	}
}
