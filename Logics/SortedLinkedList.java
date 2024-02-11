package code;

class Node{
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node(int data,Node next) {
		this.data = data;
		this.next = next;
	}
}

public class SortedLinkedList {
	
	static Node insert(Node start,int x) {	
		 
		//sorting the rest elements inside the list 
		Node p = start;
		while(p.next!=null) {		
			if(p.next.data > x)
				break;
			else 
				p = p.next;
		}		
		 p.next = new Node(x,p.next);	
		 return p.next;
	}
	
	public static void main(String[] args) {
		
		/*Node start = new Node(10);
		Node p = start;
		p.next = new Node(11);
		p = p.next;	
		p.next = new Node(13,p);	
		p = p.next;
		p.next = new Node(12);
		p = p.next;
		for(p=start;p!=null;p=p.next) {
			System.out.println(p.data);
		}
		*/
		
		Node start = new Node(4);
		insert(start,6);
		insert(start,19);
		insert(start,11);
		insert(start,31);
		insert(start,29);

		//Printing the sorted linked list
				for(Node p=start;p!=null;p=p.next) {
					//System.out.println(p.data);
				}
	
				
		//Delete Node in list		
		for(Node p=start;p!=null;p=p.next) {		
			 if(p.data==19) {
				 continue;
			}
			System.out.println(p.data);
		}
							
				
	}
}
