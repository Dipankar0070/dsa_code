package Tree;

import Tree.BinaryTree.Node;

public class Binary_Search_Tree {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Search_Tree(int[] arr) {
		root = create_tree(arr, 0, arr.length - 1);

	}

	public Node create_tree(int[] arr, int si, int ei) {
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = arr[mid];
		nn.left = create_tree(arr, si, mid - 1);
		nn.right = create_tree(arr, mid + 1, ei);
		return nn;
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

	public void maximum() {
		System.out.println(maximum(root));
	}

	private int maximum(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int right = maximum(nn.right);
		return Math.max(nn.val,right);
	}

}
