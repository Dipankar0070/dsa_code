package Tree;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree bt=new BinaryTree();
bt.Display();
System.out.println(bt.find(70));
bt.maximum();
bt.height();
bt.preOrder();
bt.postOrder();
bt.inOrder();
bt.levelOrder();
System.out.println();
bt.isSymmetric();
	}

}
//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false