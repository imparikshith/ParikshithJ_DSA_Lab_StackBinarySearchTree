package binaryTree;

import java.util.Scanner;

public class UserDefinedBinaryTree {
	public static void main(String[] args) {
		Node root=null;
		root=createUserDefinedBinaryTree();
		TreeTraversals traversals=new TreeTraversals();
		System.out.print("Inorder: ");
		traversals.inOrder(root);
		System.out.println();
		System.out.print("Preorder: ");
		traversals.preOrder(root);
		System.out.println();
		System.out.print("Postorder: ");
		traversals.postOrder(root);
	}

	private static Node createUserDefinedBinaryTree() {
		Node root=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		if(data==-1)
		return null;
		root=new Node(data);
		System.out.println("Enter data for left of "+data);
		root.left=createUserDefinedBinaryTree();
		System.out.println("Enter data for right of "+data);
		root.right=createUserDefinedBinaryTree();
		
		return root;
	}
}
