package Tree;

public class _1_Diameter_of_Binary_Tree {

	// Definition for a binary tree node.
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
			if (root == null) {
				return 0;
			}
			// ld=left subtree diameter
			// rd=right subtree diameter
			// sd=self diameter;
			int ld = diameterOfBinaryTree(root.left);
			int rd = diameterOfBinaryTree(root.right);
			int sd = height(root.left) + height(root.right) + 2;
			return Math.max(ld, Math.max(rd, sd));
		}

		public int height(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int lh = height(root.left);
			int rh = height(root.right);
			return Math.max(lh, rh) + 1;
		}
	}

}
