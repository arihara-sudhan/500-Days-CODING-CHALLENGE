/*
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 21/09/2022
    @ Problem Statement :  Perform Inorder Traversal in Recursive Method
*/

class BinaryTreeInOrderRecursive {
	static class Node {
		private int data;
		private Node right;
		private Node left;
		Node(int data) {
			this.data = data;
		}			
	}
	public Node create(){
		Node one = new Node(0);
		Node two = new Node(1);
		Node three = new Node(2);
		Node four = new Node(3);
		Node five = new Node(4);
		Node six = new Node(5);
		Node seven = new Node(6);
		Node root = one;
		root.left = two;
		root.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		return root;
	}
	public void preorder(Node root) {
		if(root==null)
			return;
		preorder(root.left);
		System.out.println(root.data);
		preorder(root.right);
	} 
	public static void main(String[] args){
		BinaryTreeInOrderRecursive bt = new BinaryTreeInOrderRecursive();
		Node root = bt.create();
		bt.preorder(root);
	}
}