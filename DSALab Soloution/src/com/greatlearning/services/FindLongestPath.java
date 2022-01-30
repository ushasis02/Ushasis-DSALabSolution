package com.greatlearning.services;

import java.util.ArrayList;

public class FindLongestPath {
	// static function
	// return ArrayList<Integer>
	//Node

	public static ArrayList<Integer> findlongestpath (Node root){

		//Base condition
		//If root is null
		//return an empty list

		if(root == null) {
			ArrayList<Integer> output = new ArrayList<>();
			return output;
			} 

		//Recursive call on root.right
		//Recursive call on root.left

	ArrayList<Integer> lefttraverse	= findlongestpath(root.left);
	ArrayList<Integer> righttraverse = findlongestpath(root.right);
	
	//Compare the paths...size
	// add root.data to longest path
			
	if (lefttraverse.size()>righttraverse.size()) 
	       lefttraverse.add(root.data);
	    else 
		   righttraverse.add(root.data);
	
	// return the longest path
	if (lefttraverse.size()>righttraverse.size()) 
	       return lefttraverse;
	    else 
		   return righttraverse; 
		
	}
	}
