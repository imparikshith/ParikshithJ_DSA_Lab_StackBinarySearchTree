package binaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDefinedBST {
	static ArrayList<Integer> nodeList=new ArrayList<>();
	public static void main(String[] args) {
		Node root=null;
		Node nn;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of nodes");
		int size=sc.nextInt();
		int i;
		int data;
		for(i=1;i<=size;i++)
		{
			System.out.println("Enter data for Node "+i+": ");
			data=sc.nextInt();
			nn=new Node(data);
			if(root==null)
			{
				root=nn;
			}
			else
			{
				insert(root,nn);
			}
		}
		
		inOrder(root);
		System.out.println(nodeList);
		
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		int n1,n2;
		int flag=0;
		
		for(int j=0;j<nodeList.size();j++)
		{
			n1=nodeList.get(j);
			n2=sum-n1;
			for(int k=j+1;k<nodeList.size();k++)
			{
				if(n2==nodeList.get(k))
				{
					System.out.println("Pair found ["+n1+","+n2+"]");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		System.out.println("Pair not found");
	}
	
	static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			nodeList.add(root.data);
			inOrder(root.right);
		}
	}

	private static void insert(Node root, Node nn)
	{
		if(nn.data>root.data)
		{
			if(root.right==null)
			{
				root.right=nn;
			}
			else
			{
				insert(root.right,nn);
			}
		}
		else
		{
			if(root.left==null)
			{
				root.left=nn;
			}
			else
			{
				insert(root.left,nn);
			}
		}
	}
}
