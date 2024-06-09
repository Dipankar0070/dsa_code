package Graph;
import java.util.*;
public class is_Graph_Bipartite {

	//leetcode 785
	class BipartitePair{
		int vtx;
		int dist;
		
		public BipartitePair(int vtx,int dist) {
			this.vtx=vtx;
			this.dist=dist;
		}
	}
	public Boolean isBipartite(int[][] graph) {
		HashMap<Integer,Integer> visited=new HashMap<>();
		Queue<BipartitePair> q=new LinkedList<>();
		
		for(int src=0;src<graph.length;src++) {
			if(visited.containsKey(src)) {
				continue;
			}
			q.add(new BipartitePair(src,0));
			while(!q.isEmpty()) {
				BipartitePair rv=q.remove();
				
				if(visited.containsKey(rv.vtx)) {
					if(visited.get(rv.vtx)!=rv.dist) {
						return false;
					}
					else {
						continue;
					}
				}
				visited.put(rv.vtx,rv.dist);
				for(int nbrs:graph[rv.vtx]) {
					if(!visited.containsKey(nbrs)) {
						q.add(new BipartitePair(nbrs,rv.dist+1));
					}
				}
			}
		}
		return true;
	}

}
