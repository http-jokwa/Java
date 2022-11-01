package Conditional_Statement;

public class Nested_If_Statement {

	public static void main(String[] args) {
	
		/*
		 * Nested if = a condition inside another condition.
		 */
		
		char sex = 'M';
		
		int age = 18;
		
		//condition 1
		if(sex == 'M') {
			
			//condition 1.1
			if(age >= 18) {
				System.out.println("Male");
				System.out.println("You are young adult");
			}
			//condition 1.2
			else {
				System.out.println("You are not adult");
			}
		}
		
		//condition 2
		else {
			System.out.println("You are female");
		}
		
		/* output : Male
		 *	    You are young adult
		 *
		 * Because condition 1 is true, it will proceed to 2nd layer condition 1.1.
		 * But when your condition 1 is false then it will proceed to condition 2.
		 * 
		 */

	}

}
