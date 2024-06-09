/*Balanced binary tree ka matlab ki 2 leaf node ke level ke bich 
jaada se jaada 1 ka anter hona tb wo balanced hai wrna not balanced 
hai.*/
package Tree;

public class Balanced_Binary_Tree {

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
		public boolean isBalanced(TreeNode root) {
			return balance(root).tf;
		}

		public Dipair balance(TreeNode root) {
			if (root == null) {
				return new Dipair();
			}
			Dipair b1 = balance(root.left);
			Dipair b2 = balance(root.right);
			int diff = b1.ht - b2.ht;
			boolean b3;
			if (diff > 1 || diff < -1) {
				b3 = false;
			} else {
				b3 = true;
			}
			Dipair dp = new Dipair();
			dp.tf = b1.tf && b2.tf && b3;
			dp.ht = Math.max(b1.ht, b2.ht) + 1;
			return dp;
		}

		class Dipair {
			boolean tf = true;
			int ht = -1;
		}
	}
}
