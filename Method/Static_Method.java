package Method;

public class Static_Method {

	/*
	 * Static Method = doesn't need to create an object.
	 * to run the static method, just call the static method name
	 * inside the main method.
	 * 
	 * our method name is myName() and greetings().
	 * 
	 * when using return type void, no need to use RETURN keyword.
	 * when your return type is data type you need to use return keyword.
	 * when returning a value, returning value should same type as method return type.
	 * 
	 * If  your method is String, you must return a String value.
	 * 
	 */
	
	static void myName() {
		System.out.println("Juan Dela Cruz");
	}
	
	static String greetings() {
		
		String greet = "Good Morning";   
		System.out.println(greet);
		
		return greet;
	}
	
	public static void main(String[] args) {
		
		myName(); 		//output : Juan Dela Cruz
		greetings();	//output : "Good Morning
	}

}
