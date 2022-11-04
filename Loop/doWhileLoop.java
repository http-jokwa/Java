package Loops;

public class doWhileLoop {

	public static void main(String[] args) {
	
		
		int x = 1;
		
		do {
			System.out.println(x + " is less than 10");
			x++;
		}
		while(x<10);
	
		/*
		 * in do while, the do statement will execute first 
		 * the code then check the condition if true or false
		 */
		
		/*
		 * OUTPUT
		 * 	1 is less than 10
			2 is less than 10
			3 is less than 10
			4 is less than 10
			5 is less than 10
			6 is less than 10
			7 is less than 10
			8 is less than 10
			9 is less than 10
		 * 
		 */

	}

}
