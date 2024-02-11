package com.datastructures.code;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Here I'am using 'Adjacency Matrix' to implement this undirected graph
 */

public class UnDirectedGraphAM {

	public static Integer[][] matrix;
	public static int totalNodes = 0;
	
	public static void adjacentMatrix(int nodeValue, int edgeValue, Integer[][] matrx) {
		matrix[nodeValue][edgeValue] = edgeValue;
		for(int row=0;row<=totalNodes-1;row++) {
			for(int column=0;column<=totalNodes-1;column++) {
				if(column!=0 && matrix[row][column]==null) {
					matrix[row][column] = 0;
				}else if(row==matrx.length-1 && column==0) {
					matrix[nodeValue][column] = nodeValue;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		totalNodes = 6;
		matrix = new Integer[totalNodes][totalNodes];
		
		adjacentMatrix(0,1,matrix);
		adjacentMatrix(0,2,matrix);
		adjacentMatrix(0,3,matrix);
		adjacentMatrix(1,0,matrix);
		adjacentMatrix(1,4,matrix);
		adjacentMatrix(1,5,matrix);
		adjacentMatrix(2,0,matrix);
		adjacentMatrix(2,4,matrix);
		adjacentMatrix(3,0,matrix);
		adjacentMatrix(3,4,matrix);
		adjacentMatrix(4,1,matrix);
		adjacentMatrix(4,2,matrix);
		adjacentMatrix(4,3,matrix);
		adjacentMatrix(4,5,matrix);
		adjacentMatrix(5,1,matrix);
		adjacentMatrix(5,4,matrix);
		
		for(int row=0;row<=totalNodes-1;row++) {
			for(int column=0;column<=totalNodes-1;column++) {
				System.out.print(matrix[row][column]+" ");
			}System.out.println("\n");
		}
		
		
	}
	
}
