package com.datastructures.code;

class StackNode{
	
	public int[] size;
	public int top;
	
	public StackNode(int totalElements) {
		this.size = new int[totalElements];
		this.top = 0;
	}
	
}

public class Stack {
			
	public static StackNode node;
	
	public static StackNode pop(StackNode nodeElement) {
		StackNode values = new StackNode(nodeElement.size.length-1);
		for(int i=0;i<=values.size.length-1;i++) {
			values.top = values.top+1;
			values.size[values.top-1] = nodeElement.size[values.top];
		}
		return values;
	}
	
	public static void push(StackNode nodeElement, int data) {
		if(nodeElement.size[nodeElement.top]==0) {
			nodeElement.top = (nodeElement.size.length)-1;
			nodeElement.size[nodeElement.top] = data;
		}else{
			nodeElement.top = nodeElement.top-1;
			nodeElement.size[nodeElement.top] = data;
		}
	}
	
	public static void main(String[] args) {
		
		StackNode value = new StackNode(4);
		
		push(value, 10);
		push(value, 20);
		push(value, 30);
		push(value, 40);
		
		for(int i=0;i<=value.size.length-1;i++) {
			System.out.println(value.size[i]);
		}
		
		System.out.println("\n");
		
		StackNode pop;
		pop = pop(value);
		pop = pop(pop);
		//pop = pop(pop);
		//pop = pop(pop);
		
		for(int i=0;i<=pop.size.length-1;i++) {
			System.out.println(pop.size[i]);
		}
		
	}

}
