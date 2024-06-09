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
	//class Solution {
		int visible = -1;

		public void rightSideView() {
			List<Integer> ll = new ArrayList<>();
			view(root, ll, 0);
		//	return ll;
			for(int l=0;l<ll.size();l++) {
				System.out.println(ll.get(l));
			}
		}

		public void view(Node root, List<Integer> ll, int level) {
			if (root == null) {
				return;
			}
			if (visible < level) {
				ll.add(root.val);
				visible++;
			}

			view(root.right, ll, level + 1);
			view(root.left, ll, level + 1);
		}
	//}
	
    public static void main(String args[]) {
    	Main m=new Main();
    	m.rightSideView();
    }
}