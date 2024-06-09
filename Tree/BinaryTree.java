package Tree;

import java.util.*;

import Tree.Symmertic_Tree.TreeNode;

public class BinaryTree {

	public class Node {
		int val;
		Node left;
		Node right;
	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public BinaryTree() {
		root = CreateTree();
	}

//O(n)
	private Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean(); // has left child
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}

	// O(n)
	public void Display() {
		Display(root);
	}

	private void Display(Node node) { // private bana rhe hai kyunki mere rashke qamar🤣🤣🤣🤣🤣🤣🤣
		if (node == null) { // kyuki display function ye wala bina root node ke acces
							// nahi ho skta hai aur mail funtio n ke paas root node
							// hai isiliye;
			return; // aur isiliye line no 34 me naye display se is display ko
					// call krke kaam kr rhe hai
		}
		String s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = " ." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);
	}

	// O(n)
	public boolean find(int item) {
		return (find(root, item));
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}

		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;
	}

	// int max=0;
	public void maximum() {
		System.out.println(maximum(root));
	}

	private int maximum(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		/*
		 * max=Math.max(max, nn.val);
		 * 
		 * int left=maximum(nn.left,max); if(left<max) { left=max; } int
		 * right=maximum(nn.right,max); if(right<max){ right=max; }
		 *
		 * return Math.max(left, right);
		 */
		int left = maximum(nn.left);
		int right = maximum(nn.right);
		return (Math.max(nn.val, Math.max(left, right)));
	}

	public void height() {
		System.out.println(height(root));
	}

	private int height(Node nn) {
		if (nn == null) {
			// return 0;// agar nodes count krna hai
			return -1; // agar height nikaalna hai
		}
		// cnt++;
		int left = height(nn.left);
		int right = height(nn.right);
		// return (Math.max(cnt,Math.max(left, right)));
		return Math.max(left, right) + 1;
	}

	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node nn) {
		if (nn == null) {
			return;
		}
		System.out.print(nn.val + " ");
		preOrder(nn.left);
		preOrder(nn.right);
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

	public void inOrder() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node nn) {
		if (nn == null) {
			return;
		}
		inOrder(nn.left);
		System.out.print(nn.val + " ");
		inOrder(nn.right);
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

	public void isSymmetric() {

		System.out.println(isSymmetric(root.left, root.right));
	}

	public boolean isSymmetric(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		boolean b1 = isSymmetric(root1.left, root2.right);
		boolean b2 = isSymmetric(root1.right, root2.left);
		return b1 && b2;
	}

	public boolean isSame(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		boolean b1 = isSame(root1.left, root2.left);
		boolean b2 = isSame(root1.right, root2.right);
		return b1 && b2;
	}

	public boolean isSameStructure(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}

		boolean b1 = isSameStructure(root1.left, root2.left);
		boolean b2 = isSameStructure(root1.right, root2.right);
		return b1 && b2;
	}
}
