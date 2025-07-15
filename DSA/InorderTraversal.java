//Write a program to print the inorder traversal of a binary tree.

package GS.DSA.DSA;
public class InorderTraversal {
	public static void main(String[] args) {

		Node n=new Node(20);
		Node nl=new Node(10);
		Node nr=new Node(30);
		Node nll=new Node(5);
		Node nlr=new Node(12);
		
		n.left=nl;
		n.right=nr;
		n.left.left=nll;
		n.left.right=nlr;
		

		inOrderTrav(n);
	}
	
	public static void inOrderTrav(Node n) {
		if(n==null) {
			return;
		}
		inOrderTrav(n.left);
		System.out.print(n.data); System.out.print(" ");
		inOrderTrav(n.right);
	}
	
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
}


