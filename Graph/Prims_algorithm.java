package Graph;

import java.util.*;

public class Prims_algorithm {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public int prism() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
			
		});
		int sum = 0;
		pq.add(new PrimsPair(3, 3, 0));
		while (!pq.isEmpty()) {
			PrimsPair rv = pq.remove();
			if (visited.contains(rv.vtx)) {
				continue;
			}
			visited.add(rv.vtx);
			System.out.println(rv);
			sum = sum + rv.cost;
			for (int nbrs : map.get(rv.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rv.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rv.vtx, cost));
				}
			}
		}
		return sum;
	}

	class PrimsPair {
		int vtx;
		int from;
		int cost;

		public PrimsPair(int vtx, int from, int cost) {
			this.vtx = vtx;
			this.from = from;
			this.cost = cost;
		}
		@Override
		public String toString(){
			return this.vtx+" "+this.from+" @ "+this.cost;
		}
	}

	public static void main(String[] args) {
		Prims_algorithm pp = new Prims_algorithm(7);
		pp.AddEdge(1, 2, 2);
		pp.AddEdge(1, 4, 5);
		pp.AddEdge(2, 3, 3);
		pp.AddEdge(4, 3, 4);
		pp.AddEdge(4, 5, 7);
		pp.AddEdge(5, 6, 1);
		pp.AddEdge(5, 7, 6);
		pp.AddEdge(6, 7, 8);
		System.out.println(pp.prism());

	}
}
