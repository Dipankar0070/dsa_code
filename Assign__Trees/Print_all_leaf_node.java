import java.util.*;

public class Main {
	
	public class Node {
		int val;
		Node left;
		Node right;
	}

	Node root;
	Scanner sc = new Scanner(System.in);

	public Main() {

		root = createtree(root);
	}

	private Node createtree(Node root) {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node rv = q.poll();
			int i1 = sc.nextInt();
			int i2 = sc.nextInt();
			if (i1 != -1) {
				Node n = new Node();
				n.val = i1;
				rv.left = n;
				q.add(n);
			}
			if (i2 != -1) {
				Node n = new Node();
				n.val = i2;
				rv.right = n;
				q.add(n);
			}

		}
		return root;
	}
	public void displayAns() {
		display(root);
	}
	public void display(Node root) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			System.out.println(root.val+" ");
		}
		
		display(root.left);
		display(root.right);
	}
    public static void main(String args[]) {
    	Main m=new Main();
    	m.displayAns();
    }
}