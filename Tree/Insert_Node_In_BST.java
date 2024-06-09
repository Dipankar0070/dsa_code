package Tree;

public class Insert_Node_In_BST {

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
		public TreeNode insertIntoBST(TreeNode root, int val) {
			return insert(root, val);
		}

		public TreeNode insert(TreeNode root, int item) {
			if (root == null) {
				return new TreeNode(item);
			}
			if (root.val > item) {
				root.left = insert(root.left, item);
			} else {
				root.right = insert(root.right, item);
			}
			return root;
		}
	}

}
