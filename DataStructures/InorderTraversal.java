package com.datastructures.code;

import java.util.Stack;

class InorderTreeNode{
	
	int data;
	InorderTreeNode left;
	InorderTreeNode right;
	
	public InorderTreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}

public class InorderTraversal {
	
	public static InorderTreeNode treeNode;
	
	public static int counter=0;
	
	public static Stack<InorderTreeNode> storeVal = new Stack<InorderTreeNode>();
	
	public static void addValue(InorderTreeNode node, int value) throws InterruptedException {
		
		if(value<node.data) {
			
			if(node.left!=null) {
				addValue(node.left, value);
			}else {
				System.out.println("Adding "+value+" to left  of "+node.data);
				node.left = new InorderTreeNode(value);
			}
			
		}else if(value>node.data) {
			
			if(node.right!=null) {
				addValue(node.right, value);
			}else {
				System.out.println("Adding "+value+" to right of "+node.data);
				node.right = new InorderTreeNode(value);
			}
			
		}
        
	}
	
	public static void inOrderTraverse(InorderTreeNode node) throws InterruptedException {

		//Thread.sleep(500);
		
		if (node == null) {
			//System.out.print("null->");
			/*
			 * You can only use return without any expression following it in a void method. 
			 * It serves as an immediate termination point for the method. 
			 * It is mostly used inside some early termination branches that bypass the main logic of a method
			 */
			return;
		}else if(node!=null) {
			//counter = counter+1;
			//System.out.println("Left->"+counter+"\n");
			inOrderTraverse(node.left);
			System.out.print(node.data + "->");
			//System.out.println("Right->"+counter+"\n");
			inOrderTraverse(node.right);
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		treeNode = new InorderTreeNode(40);
		
		addValue(treeNode, 30);
		addValue(treeNode, 20);
		addValue(treeNode, 32);
		addValue(treeNode, 50);
		addValue(treeNode, 45);
		addValue(treeNode, 70);
		
		System.out.println("\n");
		
		inOrderTraverse(treeNode);
		
	}

}
