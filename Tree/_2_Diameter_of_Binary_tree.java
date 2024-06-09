package Tree;

import Tree._1_Diameter_of_Binary_Tree.TreeNode;

public class _2_Diameter_of_Binary_tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dt;
		}

		public Dipair diameter(TreeNode root) {
			if (root == null) {
				return new Dipair();
			}
			Dipair ld = diameter(root.left);
			Dipair rd = diameter(root.right);
			int sd = ld.ht + rd.ht + 2;
			Dipair ans = new Dipair();
			ans.dt = Math.max(ld.dt, Math.max(rd.dt, sd));
			ans.ht = Math.max(ld.ht, rd.ht) + 1;
			return ans;
		}

		class Dipair {
			int dt = 0; // diameter
			int ht = -1; // height
		}
	}
}
