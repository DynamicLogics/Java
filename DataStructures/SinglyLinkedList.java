package com.datastructures.code;

class SinglyNode{
	
	public int data=0;
	public SinglyNode tail;
	
	public SinglyNode(int data) {
		this.data = data;
		this.tail = null;
	}
	
}

public class SinglyLinkedList {
	
	public static SinglyNode linkedList;
	
	//if you want to insert value one-by-one to linked-list
	public static void insertValue(SinglyNode linkedList, int value) {
		if(linkedList.tail!=null) {
			insertValue(linkedList.tail,value);
		}else {
			linkedList.tail = new SinglyNode(value);
		}
	}
	
	//if you want to insert value to end of linked-list
	public static void insertValueToLast(SinglyNode linkedList, int value) {
		if(linkedList.tail==null) {
			linkedList.tail = new SinglyNode(value);
		}else {
			insertValueToLast(linkedList.tail,value);
		}
	}
	
	//delete a node from linked-list
	public static void deletedHead(SinglyNode linkedList, int valueToBeDeleted) {
		if(linkedList.data!=valueToBeDeleted) {
			deletedHead(linkedList.tail,valueToBeDeleted);
		}else {
			linkedList.data = linkedList.tail.data;
			linkedList.tail = linkedList.tail.tail;
		}
	}
	
	//print the singly linked-list value
	public static void printLinkedListData(SinglyNode linkedList) {
		if(linkedList.tail!=null) {
			System.out.println("Head: "+linkedList.data + " Tail: "+linkedList.tail.data);
			printLinkedListData(linkedList.tail);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		SinglyNode linkedList = new SinglyNode(10);
		
		//if you want to insert value one-by-one to linked-list
		insertValue(linkedList,20);
		insertValue(linkedList,30);
		insertValue(linkedList,40);
		insertValue(linkedList,50);
		insertValue(linkedList,60);
		
		//if you want to insert value to end of linked-list
		insertValueToLast(linkedList,70);
		
		printLinkedListData(linkedList);
		
		System.out.println("\n");
		
		deletedHead(linkedList,30);
		
		//print the singly linked-list value
		printLinkedListData(linkedList);
		
	}
	
}
