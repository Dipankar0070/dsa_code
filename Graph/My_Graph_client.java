package Graph;
import java.util.*;
public class My_Graph_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Graph g = new My_Graph(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.display();
		boolean a=g.haspath(1,6,new HashSet<Integer>());
		System.out.println(a);
		g.printallpath(1,6,new HashSet<Integer>(),"");
		System.out.println(g.BFS(1,6));
		System.out.println(g.DFS(1,6));
		g.BFT();
		g.DFT();
		
	}

}
