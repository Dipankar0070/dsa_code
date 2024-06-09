package Graph;

import java.util.*;

public class Graph_VAlid_Tree {

	// sirf main logic likhe hai kyonki
	// ye leetcode 261 hai joki premium hai.
	public static void main(String[] args) {
		int n=5;
		int [][] edges= {{0,1},{0,2},{0,3},{1,4}};
		System.out.println(ValidTree(n,edges));
		
	}
	public static boolean ValidTree(int n, int[][] edges) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < edges.length; i++) {
			int a = edges[i][0];
			int b = edges[i][1];
			map.get(a).add(b);
			map.get(b).add(a);
		}
		return(BST(map));

	}

	public static boolean BST(HashMap<Integer, List<Integer>> map) {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		int count = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.remove();

				if (visited.contains(rv)) {
					return false;
				}
				visited.add(rv);

				for (int nbrs : map.get(rv)) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return count==1;
	}

}
