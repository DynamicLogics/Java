package com.datastructures.code;

class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}

public class BinaryTree {
	
	public static Node treeNode;
	
	public static void addValue(Node node, int value) throws InterruptedException {
		
		if(value<node.data) {
			
			if(node.left!=null) {
				addValue(node.left, value);
			}else {
				System.out.println("Adding "+value+" to left  of "+node.data);
				node.left = new Node(value);
			}
			
		}else if(value>node.data) {
			
			if(node.right!=null) {
				addValue(node.right, value);
			}else {
				System.out.println("Adding "+value+" to right of "+node.data);
				node.right = new Node(value);
			}
			
		}
        
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		treeNode = new Node(40);
		
		addValue(treeNode, 30);
		addValue(treeNode, 20);
		addValue(treeNode, 35);
		addValue(treeNode, 50);
		addValue(treeNode, 45);
		addValue(treeNode, 70);
		
	}

}
