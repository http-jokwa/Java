package Method;

public class Parameterized_Method {
	
	/*
	 * Parameterize Method = assigning a value inside the parenthesis of your method.
	 * 
	 * We have 1 static and 1 non-static method.
	 * We need to create object for non-static method.
	 * 
	 */
	
	public static void myFname(String fname) {
		
		System.out.println("My first name is " + fname);
		
	}
	
	public void myLname(String lname) {
		
		System.out.println("My last name is " + lname);
	}

	public static void main(String[] args) {
		
		Parameterized_Method myObj = new Parameterized_Method();
		
		//Call the static method.
		myFname("Joschua");				//output : My first name is Joschua
		
		//Call the non-static method
		myObj.myLname("Ordonio");		//output : My last name is Ordonio
		
	}

}
