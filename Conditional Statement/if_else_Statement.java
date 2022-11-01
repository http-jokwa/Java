package Conditional_Statement;

public class if_else_Statement {

	public static void main(String[] args) {
		
		/*
		 * If our 1st condition is false, the condition will
		 * jump to the 2nd condition and check if it's
		 * true or false and then print the code.
		 */
		
		int x = 10, y = 20;
		
		//this is false
		if (x > 20) {
			System.out.println(x + " is greater than 20"); 
		}
		else {
			System.out.println(x + " is less than " + y);
		}
		
		// output : 10 is less than 20

	}

}
