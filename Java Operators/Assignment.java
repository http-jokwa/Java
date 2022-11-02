package Operators;

public class Assignment {

	public static void main(String[] args) {
		
		/*
		 * We use = sign to declare value to variable.
		 * ( +=, -=, *=, /=, %= ) these are the operator
		 * that we will use.
		 * 
		 */
		
		int x = 3, y = 2;
		
		//simplified
		x += y;
		
		//expanded
		x = x + y;
		
		System.out.println("Simplified: " + x);
		System.out.println("Expanded: " + x);

	}
}