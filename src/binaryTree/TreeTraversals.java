package binaryTree;

public class TreeTraversals {
	void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+",");
			inOrder(root.right);
		}
	}
	
	void preOrder (Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+",");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	void postOrder (Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+",");
		}
	}
}
