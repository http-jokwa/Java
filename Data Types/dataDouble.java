package DataTypes;

public class dataDouble {

	public static void main(String[] args) {
		
		/*Float datatype is a double precision
		 * use capital D after the value to identify as double
		 */
		
		double num1 = 9999999999D; //correct way of declaring a value for double
		float num2 = 9999999999f;
		
		System.out.println(num1); //output: 9.999999999E9     this is double
		System.out.println(num2); //output: 1.0E10			  this is float
	}

}
