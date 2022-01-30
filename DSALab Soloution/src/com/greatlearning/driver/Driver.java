package com.greatlearning.driver;

import com.greatlearning.services.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String bracketExpression = "([[{}]])";
      
      boolean result;
      
      BalancingBrackets balancingbracket = new BalancingBrackets();
     
      result = balancingbracket.bracketcheck(bracketExpression);
      System.out.println(bracketExpression);
      if (result)
    	  System.out.println("The entered string has Balanced brackets");
      else
    	  System.out.println("The entered string do not contain Balanced brackets");
     }

}
