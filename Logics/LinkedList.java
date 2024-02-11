package code;
/*
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
	
	 Node(int data, Node next) {
		 this.data = data;
		 this.next = next;
	 }
}
*/

public class LinkedList {
	
	public static void main(String[] args) {
		
		/*Bulky method of inserting a node 
		 * 
		Node start = new Node(20);
		start.next = new Node(10);
		start.next.next = new Node(11);
		*/
		
		/*Convenient Way
		 * 
		Node start = new Node(10);	
		Node pointer = start;
		pointer.next = new Node(11);
		pointer = pointer.next;
		pointer.next = new Node(12);
		pointer = pointer.next;
		pointer.next=new Node(13);
		pointer = pointer.next;		
		*/
		
		//Convenient way
	/*	Node start = new Node(10);	
		Node pointer = start;
		
		for (int i=11;i<=14;i++) {
			pointer = pointer.next = new Node(i);
		}
		
		for (pointer = start; pointer != null; pointer = pointer.next) {
			 System.out.println(pointer.data);
			 System.out.println("Hexadecimal Memory Address-> "+pointer);
		}*/
		
	}
}
