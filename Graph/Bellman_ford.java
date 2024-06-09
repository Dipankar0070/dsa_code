package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Graph.Kruskal_algo.EdgePair;

public class Bellman_ford {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Bellman_ford(int n) {
		map = new HashMap<>(n);
		for (int i = 1; i <= n; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
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

	public void bellmanFordAlgo(int src) {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 1; i < dis.length; i++) {
			dis[i] = 10000_000;
		}
		dis[src] = 0;
		List<EdgePair> ll = AllEdge();
		for (int i = 1; i <= v ; i++) {
			for (EdgePair e : ll) {
				if(i==v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve weight cycle present");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i]+" ");
		}
	}

	public static void main(String[] args) {
		Bellman_ford bf = new Bellman_ford(5);
		bf.AddEdge(1, 2, 8);
		bf.AddEdge(1, 3, 4);
		bf.AddEdge(1, 4, 5);
		bf.AddEdge(3, 4, -3);
		bf.AddEdge(4, 5, 4);
		bf.AddEdge(5, 2, 1);
		bf.AddEdge(2, 5, -2);
		bf.bellmanFordAlgo(1);
	}
}
