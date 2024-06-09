package Tree;

public class Delete_Node_In_BST {

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
		public TreeNode deleteNode(TreeNode root, int key) {
			return del(root, key);
		}

		public TreeNode del(TreeNode nn, int item) {
			if (nn == null) {
				return null;
			}
			if (nn.val > item) {
				nn.left = del(nn.left, item);
			} else if (nn.val < item) {
				nn.right = del(nn.right, item);
			} else {
				// 0 child or 1 child.
				if (nn.left == null) {
					return nn.right;
				} else if (nn.right == null) {
					return nn.left;
				} else {
					int max = maximum(nn.left);
					nn.left = del(nn.left, max);
					nn.val = max;
				}
				// ya agar hum doosre tarike se kre to
				// else{
				// int min=minimum(nn.right);
				// nn.right=del(nn.right,min);
				// nn.val=min;
				// }
			}
			return nn;
		}

		private int maximum(TreeNode nn) {
			if (nn == null) {
				return Integer.MIN_VALUE;
			}

			int right = maximum(nn.right);
			return Math.max(nn.val, right);
		}
	}

}
