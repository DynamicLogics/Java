package com.datastructures.code;

import java.util.ArrayList;
import java.util.LinkedList;

class UDGBFS{
	int node;
	int edge;
	
	public UDGBFS(int node,int edge) {
		this.node = node;
		this.edge = edge;
	}
	
}
	
public class Graph_BFS {
	
	public static UDGBFS uniGraph;
	public static ArrayList<LinkedList<Integer>> adjMatrix = new ArrayList<LinkedList<Integer>>();
	public static LinkedList<Integer> val;
	
	public static void adjacentlist(int nodeValue, int edgeValue) {
		uniGraph = new UDGBFS(nodeValue, edgeValue);
		if(!adjMatrix.isEmpty() && adjMatrix.size()-1>=0 && 
			adjMatrix.get(adjMatrix.size()-1).get(0)==uniGraph.node) {
			adjMatrix.get(adjMatrix.size()-1).add(uniGraph.edge);
		}else {
			val = new LinkedList<Integer>();
			val.add(uniGraph.node);
			val.add(uniGraph.edge);
			adjMatrix.add(val);
		}
	}
	
	public static int vertex = 0;
	public static LinkedList<Integer> currentNode = new LinkedList<Integer>();
	public static ArrayList<Integer> visitedNodes = new ArrayList<Integer>();
	
	public static void BFS(ArrayList<LinkedList<Integer>> adjMatrix) {
		try {
			for(int i=0;i<=adjMatrix.get(vertex).size()-1;i++) {
				if(!currentNode.contains(adjMatrix.get(vertex).get(i)) && 
				   !visitedNodes.contains(adjMatrix.get(vertex).get(i))) {
					currentNode.add(adjMatrix.get(vertex).get(i));
				}
			}
			visitedNodes.add(currentNode.get(0));
			System.out.print(currentNode.get(0)+" --> ");
			currentNode.remove(0);
			vertex = currentNode.get(0);
			BFS(adjMatrix);
		}catch(Exception e) {
			System.out.print("end");
			return;
		}
	}
	
	public static void main(String[] args) {
		
		adjacentlist(0, 1);
        adjacentlist(0, 2);
        adjacentlist(1, 2);
        adjacentlist(2, 0);
        adjacentlist(2, 3);
        adjacentlist(3, 3);
        
        //If you want to traverse from certain vertex/nodes then set 'vertex' value as below
        //vertex = 2;		
		BFS(adjMatrix);
		
	}
		
}
