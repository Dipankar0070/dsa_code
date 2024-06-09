package Tree;

public class Max_Sum_BST_in_Binary_tree {

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
		public int maxSumBST(TreeNode root) {
			return valid(root).ans;
		}

		public tripair valid(TreeNode root) {
			if (root == null) {
				return new tripair();
			}
			tripair left = valid(root.left);
			tripair right = valid(root.right);
			tripair self = new tripair();
			boolean self_tf = left.max < root.val && right.min > root.val;
			self.tf = left.tf && right.tf && self_tf;
			self.max = Math.max(left.max, (Math.max(right.max, root.val)));
			self.min = Math.min(left.min, (Math.min(right.min, root.val)));
			self.sum = left.sum + right.sum + root.val;
			if (self.tf) {
				self.ans = Math.max(self.sum, Math.max(left.ans, right.ans));
			} else {
				self.ans = Math.max(left.ans, right.ans);
			}
			return self;
		}

		class tripair {
			boolean tf = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			int sum = 0;
			int ans = 0;
		}
	}

}
