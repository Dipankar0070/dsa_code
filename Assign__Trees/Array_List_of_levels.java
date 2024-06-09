import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public List<List<Integer>> levelArrayList() {
			if(root==null){
				return Collections.emptyList();
			}

			
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			List<List<Integer>> ll=new ArrayList<>();
			while(!q.isEmpty()){
				ArrayList<Integer> current=new ArrayList<>();
				int qlen=q.size();
				for(int i=0;i<qlen;i++){
				Node rv=q.poll();

				current.add(rv.data);
				if(rv.left!=null){
					q.add(rv.left);
				}
				if(rv.right!=null){
					q.add(rv.right);
				}
				}
				ll.add(current);
			}
			return ll;
		}

	}

}

