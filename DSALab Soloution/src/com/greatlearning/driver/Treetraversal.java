package com.greatlearning.driver;

import java.util.ArrayList;

import com.greatlearning.services.FindLongestPath;
import com.greatlearning.services.Node;

public class Treetraversal {
    	
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
    		// create a node
    		//build a tree
    		//root.left = new Node(20);
    	Node root = new Node(100);
		root.left = new Node(20);
		root.right = new Node (130);
		root.left.left = new Node (10);
		root.left.right = new Node(50);
		root.right.left = new Node (110);
		root.right.right = new Node (140);
		root.left.left.left = new Node(5);
		
		//findlongestpath
				
		
		FindLongestPath Findlong = new FindLongestPath();
    	ArrayList<Integer> output = new ArrayList<Integer>(); 	
    	output = Findlong.findlongestpath(root);
    	 	
    	//print the longest past
		int size = output.size();
		System.out.print("Longest Path " + output.get(size-1));
		for (int i=size-2; i>=0; i--)
			System.out.print("->" + output.get(i));
    	
	}

}
