package com.datastructures.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;

/*
 * Here I'am using 'Adjacency List' to implement this undirected graph
 */

class UDGNode{
	int node;
	int edge;
	
	public UDGNode(int node,int edge) {
		this.node = node;
		this.edge = edge;
	}
	
}

public class UnDirectedGraphAL {
	
	public static UDGNode uniGraph;
	public static ArrayList<LinkedList<Integer>> adjMatrix = new ArrayList<LinkedList<Integer>>();
	public static LinkedList<Integer> val;
	
	public static void adjacentlist(int nodeValue, int edgeValue) {
		uniGraph = new UDGNode(nodeValue, edgeValue);
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
	
	public static void main(String[] args) {
		
		//If you want to traverse from certain vertex/nodes then set 'vertex' value as below
		adjacentlist(0, 1);
        adjacentlist(0, 2);
        adjacentlist(1, 2);
        adjacentlist(2, 0);
        adjacentlist(2, 3);
        adjacentlist(3, 3);
		
        for (LinkedList<Integer> adjMtrx : adjMatrix) {
			System.out.println(adjMtrx);
		}
		
	}
	
}
