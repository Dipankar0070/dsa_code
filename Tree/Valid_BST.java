package Tree;

public class Valid_BST {

	
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
	   /* public boolean isValidBST(TreeNode root) {
	        if(root==null){
	            return true;
	        }       
	        
	       boolean left =isValidBST(root.left);
	       boolean right= isValidBST(root.right);
	        long Leftmax=maximum(root.left);
	        long Rightmin=minimum(root.right);
	        boolean self=false;
	        if(Leftmax<root.val && Rightmin>root.val){
	            self=true;
	        }
	        return left && right && self;
	    }
	    public long maximum(TreeNode nn) {
			if (nn == null) {
				return Long.MIN_VALUE;
			}

			long right = maximum(nn.right);
			return Math.max(nn.val,right);
		}

	    public long minimum(TreeNode nn) {
			if (nn == null) {
				return Long.MAX_VALUE;
			}

		    long left = minimum(nn.left);
			return Math.min(nn.val,left);
		}*/
	    public boolean isValidBST(TreeNode root){
	        return valid(root).tf;
	    }
	    public tripair valid(TreeNode root){
	        if(root==null){
	            return new tripair();
	        }
	        tripair left=valid(root.left);
	        tripair right=valid(root.right);
	        tripair self=new tripair();
	        boolean self_tf=left.max<root.val && right.min>root.val;
	        self.tf=left.tf && right.tf && self_tf;
	        self.max=Math.max(left.max,(Math.max(right.max,root.val)));
	        self.min=Math.min(left.min,(Math.min(right.min,root.val)));
	        return self;
	    }
	    class tripair{
	        boolean tf=true;
	        long max=Long.MIN_VALUE;
	        long min=Long.MAX_VALUE;
	    }
	}

}
