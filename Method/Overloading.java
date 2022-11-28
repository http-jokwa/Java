package myExperiment;
import java.util.Scanner;
public class Overloading {

	static Scanner in = new Scanner(System.in);
	static double hr;
	
	static double Employee() {
		double daily = 8 * hr;
		System.out.println("Daily Rate: " + daily);
		return daily;
	}
	
	static double Employee(double x) {
		double mr = x * 24;
		System.out.println("Monthly Rate: " + mr);
		return mr;
	}
	
	static double Employee(double p, double m) {
		double tx = p * m;
		System.out.println("Tax: " + (double)tx);
		return tx;
	}
	
	public static void main(String [] args) {
		
		System.out.print("Enter your hourly rate: ");
		hr = in.nextDouble();
		
		Employee();
		Employee(0.10, Employee(hr));
		
	}
}
