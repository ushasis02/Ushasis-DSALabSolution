package com.greatlearning.services;

import java.util.Stack;

public class BalancingBrackets {
 //p1
	//static function
	// boolean value return
	//brackets String ...bracketExpression
	public static boolean bracketcheck(String bracketExpression) {
		char ch, chpop;
//p2
		//Initialize a stack
		// across each of the bracket of bracketExpression
		//fetch each character
		//check if character is opening brcket
		//push
		//continue
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<bracketExpression.length(); i++) {
			ch = bracketExpression.charAt(i);
			switch (ch) {
				case '[':
					stack.push(ch);
					break;
				case '{':
					stack.push(ch);
					break;
				case '(':
					stack.push(ch);
					break;
				case ')':
				if (stack.isEmpty())
					return false;
				else {
					chpop = stack.pop();
					if (chpop != '(')
						return false; 
					else break;
				    }
									
				case '}':
					if (stack.isEmpty())
						return false;
					else {
						chpop = stack.pop();
						if (chpop != '{')
							return false; 
						else break;
					    }
				case ']':
					if (stack.isEmpty())
						return false;
					else {
						chpop = stack.pop();
						if (chpop != '[')
							return false; 
						else break;
					    }		   
	            default:
	            	System.out.println("unrecognized character");
	            	return false;
			}
		}
		return (stack.isEmpty());
	}
}
