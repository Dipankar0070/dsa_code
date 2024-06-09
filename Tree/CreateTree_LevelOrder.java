package Tree;

import java.util.*;

import Tree.BinaryTree.Node;

public class CreateTree_LevelOrder {
	public class Node {
		int val;
		Node left;
		Node right;
	}

	Node root;
	Scanner sc = new Scanner(System.in);

	public CreateTree_LevelOrder() {

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

	public void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.poll();
			System.out.print(rv.val + " ");
			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}
		}
	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node nn) {
		if (nn == null) {
			return;
		}
		postOrder(nn.left);
		postOrder(nn.right);
		System.out.print(nn.val + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree_LevelOrder cl = new CreateTree_LevelOrder();
		cl.postOrder();
	}

}
