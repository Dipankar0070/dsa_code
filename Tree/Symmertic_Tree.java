package Tree;

public class Symmertic_Tree {

	//https://leetcode.com/problems/symmetric-tree/
	
	
//	 Definition for a binary tree node.
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
		public boolean isSymmetric(TreeNode root) {
			return isSymmetric(root.left, root.right);
		}

		public boolean isSymmetric(TreeNode root1, TreeNode root2) {
			if (root1 == null && root2 == null) {
				return true;
			}
			if (root1 == null || root2 == null) {
				return false;
			}
			if (root1.val != root2.val) {
				return false;
			}
			boolean b1=isSymmetric(root1.left,root2.right);
			boolean b2=isSymmetric(root1.right,root2.left);
			return b1 && b2;
		}
	}
}
