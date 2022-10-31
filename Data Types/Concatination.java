package DataTypes;

public class Concatination {

	public static void main(String[] args) {
			
		/*
		 * We will combine different data types
		 * and we will print it
		 * 
		 * We will use "Concatination"
		 */
		
		
		String name = "Juan Dela Cruz";
		int age = 8;
		char sex = 'M';
		
		System.out.println("Hello I'am " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("Sex: " + sex);
		
		/* Output
		 * 
		 * Hello I'am Juan Dela Cruz
		 * I am 8 years old
		 * Sex: M
		 * 
		 */
		
		//We can also use the .concat
		
		String fname = "Marlboro";
		String lname = "Red";
		
		System.out.println(fname.concat(" " + lname)); //output : Marlboro Red
		
		
		
		

	}

}
