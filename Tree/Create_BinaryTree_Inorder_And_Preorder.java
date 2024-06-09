package Tree;

public class Create_BinaryTree_Inorder_And_Preorder {

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return createtree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
		}

		// is=inorder start index
		// ie=inorder end index
		// ps=preorder start index
		// pe=preorder end index
		public TreeNode createtree(int[] preorder, int[] inorder, int is, int ie, int ps, int pe) {
			if (is > ie || ps > pe) {
				return null;
			}
			TreeNode nn = new TreeNode(preorder[ps]);
			int RootInInorder = search(inorder, is, ie, preorder[ps]);
			int NumOfElement = RootInInorder - is;
			nn.left = createtree(preorder, inorder, is, RootInInorder - 1, ps + 1, ps + NumOfElement);
			nn.right = createtree(preorder, inorder, RootInInorder + 1, ie, ps + NumOfElement + 1, pe);
			return nn;
		}

		public int search(int[] inorder, int is, int ie, int item) {
			for (int i = is; i <= ie; i++) {
				if (inorder[i] == item) {
					return i;
				}
			}
			return 0;
		}
	}
}
