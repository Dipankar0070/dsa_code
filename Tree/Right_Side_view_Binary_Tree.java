					package Tree;
import java.util.*;
public class Right_Side_view_Binary_Tree {
	// Definition for a binary tree node.
	public class Node {
		int val;
		Node left;
		Node right;

		Node() {
		}

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int visible = -1;

		public List<Integer> rightSideView(Node root) {
			List<Integer> ll = new ArrayList<>();
			view(root, ll, 0);
			return ll;
		}

		public void view(Node root, List<Integer> ll, int level) {
			if (root == null) {
				return;
			}
			if (visible < level) {
				ll.add(root.val);
				visible++;
			}

			view(root.right, ll, level + 1);
			view(root.left, ll, level + 1);
		}
	}
}
