package UserInput;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
	
//		Scanner name  = new Scanner(System.in); 	
		Scanner input = new Scanner(System.in); //Create scanner for user input

		System.out.print("What is your name? ");  //Question
		String name = input.nextLine();
		
		System.out.println("Hello " + name); 	//output : Hello (user input)
		
		/*
		 * The String name serve as your input container
		 * and the print statement call the container to print the input
		 */
		
		input.close();
	}

}
