package Tree;

public class Sum_Root_To_Leaf_Numbers {
	
	// Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	class Solution {
	     public int sumNumbers(TreeNode root) {
	      return   sumNumbers(root,0);
	     }
	    public int sumNumbers(TreeNode root,int sum) {
	        if(root==null){
	            return 0;
	        }
	        if(root.left==null && root.right==null){
	            sum=sum*10+root.val;
	            return sum;
	        }
	       

	        sum=sum*10+root.val;
	       int a= sumNumbers(root.left,sum);
	        int b=sumNumbers(root.right,sum);
	        return a+b
	        
	        ;
	    }
	}
}
