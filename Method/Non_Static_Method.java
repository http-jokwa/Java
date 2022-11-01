package Method;

public class Non_Static_Method {
	
	/*
	 * Non-Static Method = does need to create an object for the method to run.
	 * 
	 * Correct way of creating an object:
	 * Class name   object name = new Class name();
	 * 
	 * Note: you must create an object inside the main method
	 * 
	 * To call the non-static method, object name + .(dot) + method name
	 */
	
	public void myName() {
		System.out.println("Jok Wa");
	}
	
	public int myAge() {
		int age = 20;
		System.out.println("My age is " + age);
		
		return age; //need to return integer value because our method is integer not void
	}

	public static void main(String[] args) {
		
	//		Class Name	 object name = new  Class Name();
		 Non_Static_Method myObj = new  Non_Static_Method();  //Object Created
		 
		 myObj.myName();	//output : Jok Wa 
		 myObj.myAge();		//output : My age is 20
				
	}

}
