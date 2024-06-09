package Graph;

import java.util.*;
import java.util.HashMap;

public class Kruskal_algo {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Kruskal_algo(int n) {
		map = new HashMap<>(n);
		for (int i = 1; i <= n; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public class EdgePair {
		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;

		}

		@Override
		public String toString() {
			return this.e1 + " --> " + this.e2 + " @ " + this.cost;

		}
	}

	public List<EdgePair> AllEdge() {
		List<EdgePair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
		return ll;
	}

	public void kruskal() {
		List<EdgePair> ll = AllEdge();
		Collections.sort(ll, new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		int ans = 0;
		DisJointSet ds = new DisJointSet();
		for (int v : map.keySet()) {
			ds.CreateSet(v);
		}

		for (EdgePair e : ll) {
			int e1 = e.e1;
			int e2 = e.e2;
			int re1 = ds.find(e1);
			int re2 = ds.find(e2);
			if (re1 == re2) {

			} else {
				ds.union(e1, e2);
				System.out.println(e);
				ans = ans + e.cost;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Kruskal_algo kl = new Kruskal_algo(7);
		kl.AddEdge(1, 2, 3);
		kl.AddEdge(1, 4, 4);
		kl.AddEdge(2, 3, 5);
		kl.AddEdge(3, 4, 6);
		kl.AddEdge(4, 5, 8);
		kl.AddEdge(5, 6, 2);
		kl.AddEdge(5, 7, 1);
		kl.AddEdge(6, 7, 9);
		kl.kruskal();
	}
}
