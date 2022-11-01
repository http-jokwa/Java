package Conditional_Statement;

public class if_Ladder_Statement {

	public static void main(String[] args) {
		
		/*
		 * If ladder or If else if State = is use
		 * when there are 3 or more condition.
		 * 
		 * we will use else if keyword.
		 * if there's no more condition, use else for closing
		 * 
		 * If 1st condition is false, jump to 2nd
		 * if 2nd is false, jump to 3rd
		 * if 3rd is false, jump to 4th and so on...
		 */
		
		int x = 10, y = 20, z = 30;
		
		//condition 1
		if (x > y && x >z) {
			System.out.println(x + " is geater than " + y + " and " + z);
		}
		
		//condition 2
		else if (z > y && z > x) {
			System.out.println(z + " is geater than " + x + " and " + y);
		}
		
		//condition 3
		else {
			System.out.println(y + " is greater than " + x + " and " + z);
		}
		
		//	condition 2 is true.
		//	output : 30 is greater than 10 and 20
		
	}

}
