package Heap;

import java.util.*;

public class My_heap {

	ArrayList<Integer> list = new ArrayList<>();

	// add
	public void add(int item) {
		list.add(item);

		upheapify(list.size() - 1);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		// list.get(pi) > list.get(ci)
		if (list.get(pi) > list.get(ci)) {
			Swap(pi, ci);
			// ci=pi
			upheapify(pi);
		}

	}// remove (top)

	public int remove() {
		Swap(0, list.size() - 1);
		int rv = list.remove(list.size() - 1);
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
		if (lc < list.size() && list.get(min) > list.get(lc)) {
			min = lc;
		}
		if (rc < list.size() && list.get(min) > list.get(rc)) {
			min = rc;
		}
		if (min != pi) {
			Swap(min, pi);
			downheapify(min);
		}
	}

	// size
	public int size() {
		return list.size();
	}

	// min
	public int min() {
		return list.get(0);
	}

	private void Swap(int pith, int cith) {
		int ii = list.get(pith);
		int jj = list.get(cith);
		list.set(pith, jj);
		list.set(cith, ii);
	}

	// display
	public void display() {
		System.out.println(list);
	}

}
