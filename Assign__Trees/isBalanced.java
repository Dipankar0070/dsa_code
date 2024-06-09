import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node root) {
			if (root == null) {
				return new BalancedPair();
			}
			BalancedPair b1 = isBalanced(root.left);
			BalancedPair b2 = isBalanced(root.right);
			int diff = b1.height - b2.height;
			boolean b3;
			if (diff > 1 || diff < -1) {
				b3 = false;
			} else {
				b3 = true;
			}
			BalancedPair dp = new BalancedPair();
			dp.isBalanced = b1.isBalanced && b2.isBalanced && b3;
			dp.height = Math.max(b1.height, b2.height) + 1;
			return dp;
		}
			
		

		private class BalancedPair {
			int height=-1;
			boolean isBalanced=true;
		}
		// class Dipair {
		// 	boolean tf = true;
		// 	int ht = -1;
		// }
	}
	}

