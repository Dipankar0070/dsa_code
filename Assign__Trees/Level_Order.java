import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
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

		public void levelOrderNewLine() {

			if (root == null) {
				return;
			}
			//boolean tf = false;
			Queue<Node> q = new LinkedList<>();
			ArrayList<Integer> ll = new ArrayList<>();
			q.add(root);
			while (!q.isEmpty()) {
		//	ArrayList<Integer> curr = new ArrayList<>();

				int qlen = q.size();
				for (int i = 0; i < qlen; i++) {

					Node rv = q.poll();
				//	if (tf == false) {
						//curr.add(rv.data);
						System.out.print(rv.data+" ");
					// } else {
					// 	curr.add(0, rv.data);
					// }
					if (rv.left != null) {
						q.add(rv.left);
					}
					if (rv.right != null) {
						q.add(rv.right);
					}
				}
				System.out.println();
				//ll.addAll(curr);
			//	tf=!tf;
			}
//for(int p=0;p<ll.size();p++){
//	System.out.print(ll.get(p)+" ");
//		}

	}}
	}

