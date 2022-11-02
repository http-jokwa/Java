package Operators;

public class Unary {

	public static void main(String[] args) {
		
		/*
		 * Unary operator = operators that act upon a single operand to produce a new value.
		 * Unary operators are:
		 * 		+ addition
		 * 		- minus
		 * 		++ increment = it has 2 parts, prefix and post-fix
		 * 		-- decrement
		 * 		! not
		 * 		~ bitwise
		 * 
		 */
		
			int x = 5, y = 10;
			boolean z = true;
			
			
			
			//addition
			System.out.println(x + 5); //output : 10
			
			//minus
			System.out.println(-x); //output : -5
			
			//increment(Prefix)
			System.out.println(++x); // output : 6
			
			//increment(Post-fix)
			System.out.println(y++); //output : 10
			System.out.println(y);  // output : 11
			
			//NOT operator
			System.out.println(!z); //output : false
			
			//Bitwise
			System.out.println(~-100);  //output : 99
	}

}
