package com.datastructures.code;

class DoublyNode{
	
	DoublyNode previous;
	int data;
	DoublyNode next;
	
	public DoublyNode(int data) {
		this.previous = null;
		this.data = data;
		this.next = null;
	}
	
}

public class DoublyLinkedList {

	public static DoublyNode doublyLinkedList;
	public static DoublyNode doublyLinkedListCopy;
	
	public static int indexPosition;
	
	public static void insertValue(DoublyNode doublyLinkedList, int data) {
		if(doublyLinkedList.next!=null) {
			insertValue(doublyLinkedList.next,data);
		}else {
			doublyLinkedList.next = new DoublyNode(data);
			doublyLinkedList.next.previous = doublyLinkedList;
		}
	}
	
	public static void insertNodeAtSpecificPosition(DoublyNode linkedList, int indexValue, int data) {
		if(indexPosition!=indexValue && linkedList.next!=null) {
			indexPosition=indexPosition+1;
			insertNodeAtSpecificPosition(linkedList.next,indexValue,data);
		}else {
			DoublyNode rightShift = new DoublyNode(linkedList.data);
			linkedList.data = data;
			linkedList.next = new DoublyNode(rightShift.data);
			linkedList.next.previous = linkedList;
		}
	}
	
	//delete a node from linked-list
	public static void deletedHead(DoublyNode linkedList, int valueToBeDeleted) {
		if(linkedList.data!=valueToBeDeleted) {
			deletedHead(linkedList.next,valueToBeDeleted);
		}else {
			linkedList.data = linkedList.next.data;
			linkedList.next = linkedList.next.next;
			linkedList.previous = linkedList.previous;
		}
	}
	
	public static void printLinkedListData(DoublyNode linkedList) {
		if(linkedList.next!=null) {
			System.out.println(
					 			linkedList.next.previous.data +
							   	" <--- Prev | " +
					 			"Next ---> " +
					 			linkedList.next.data
							   );
			printLinkedListData(linkedList.next);
		}
	}
	
	public static void main(String[] args) {
		
		DoublyNode linkedList = new DoublyNode(10);
		
		//if you want to insert value one-by-one to linked-list
		insertValue(linkedList,20);
		insertValue(linkedList,30);
		insertValue(linkedList,40);
		insertNodeAtSpecificPosition(linkedList,5,99);
		insertValue(linkedList,50);
		insertValue(linkedList,60);
		
		//insertNodeAtSpecificPosition(linkedList,4,99);
		
		printLinkedListData(linkedList);
		
	}
	
}
