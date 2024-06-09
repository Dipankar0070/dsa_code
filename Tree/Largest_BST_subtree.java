package Tree;

import java.util.*;

public class Largest_BST_subtree {
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
		public int isValidBST(TreeNode root) {
			return valid(root).size;
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
			if (self.tf) {
				self.size = left.size + right.size + 1;
			} else {
				self.size = Math.max(left.size, right.size);
			}
			return self;
		}

		class tripair {
			boolean tf = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			int size = 0;
		}
	}

}
