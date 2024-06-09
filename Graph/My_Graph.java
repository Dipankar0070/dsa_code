package Graph;

import java.util.*;

public class My_Graph {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public My_Graph(int n) {
		map = new HashMap<>(n);
		for (int i = 1; i <= n; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean Containsvertex(int v) {
		return map.containsKey(v);
	}

	public int noofEdge() {
		int count = 0;
		for (int i : map.keySet()) {
			count = count + map.get(i).size();
		}
		return count / 2;
	}

	public void RemoveEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}

	public void removevertex(int v) {
		for (int i : map.get(v).keySet()) {
			map.get(i).remove(v);
		}
		map.remove(v);
	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " --> " + map.get(key));
		}
	}

	public boolean haspath(int v1, int v2, HashSet<Integer> visited) {
		if (v1 == v2) {

			return true;
		}
		visited.add(v1);
		for (int key : map.get(v1).keySet()) {
			if (!visited.contains(key)) {
				boolean ans = haspath(key, v2, visited);

				if (ans) {
					return true;
				}

			}
		}
		// no need of visited,remove(v1);
		visited.remove(v1);
		return false;
	}

	public void printallpath(int v1, int v2, HashSet<Integer> visited, String ans) {
		if (v1 == v2) {
			System.out.println(ans + v1);
			return;
		}
		visited.add(v1);
		for (int key : map.get(v1).keySet()) {
			if (!visited.contains(key)) {
				printallpath(key, v2, visited, ans + v1 + " ");

			}
		}
		visited.remove(v1);
		return;

	}

	// BFS has path
	public boolean BFS(int src, int dest) {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1.remove
			int rv = q.remove();

			// 2.ignore
			if (visited.contains(rv)) {
				continue;
			}
			// 3.visited
			visited.add(rv);
			// 4.self check
			if (rv == dest) {
				return true;
			}
			// 5.unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}

		return false;
	}

	public Boolean DFS(int src, int dest) {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> st = new Stack();
		st.push(src);
		while (!st.isEmpty()) {
			// 1.remove
			int rv = st.pop();

			// 2.ignore
			if (visited.contains(rv)) {
				continue;
			}
			// 3.visited
			visited.add(rv);
			// 4.self check
			if (rv == dest) {
				return true;
			}
			// 5.unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}

		return false;
	}

	public void BFT() {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1.remove
				int rv = q.remove();

				// 2.ignore
				if (visited.contains(rv)) {
					continue;
				}
				// 3.visited
				visited.add(rv);
				// 4.self check
				System.out.print(rv + " ");
				// 5.unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}

		}
		System.out.println();
	}
	public void DFT() {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> st = new Stack<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// 1.remove
				int rv = st.pop();

				// 2.ignore
				if (visited.contains(rv)) {
					continue;
				}
				// 3.visited
				visited.add(rv);
				// 4.self check
				System.out.print(rv + " ");
				// 5.unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}

		}
		System.out.println();
	}
}
