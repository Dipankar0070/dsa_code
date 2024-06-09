package Tree;

import Tree.Exactly_Same_Tree.TreeNode;

public class Same_Structure_Tree {

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

	

		public boolean isSameStructure(TreeNode root1, TreeNode root2) {
			if (root1 == null && root2 == null) {
				return true;
			}
			if (root1 == null || root2 == null) {
				return false;
			}
		
			boolean b1=isSameStructure(root1.left,root2.left);
			boolean b2=isSameStructure(root1.right,root2.right);
			return b1 && b2;
		}
	
}
