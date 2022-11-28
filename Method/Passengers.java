package myExperiment;
import java.util.Scanner;
public class Passengers {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of passenger/s: ");
		int size = in.nextInt();
		
		for(int i = 0; i<size; i++) {
			
			System.out.print("Enter Passengers Name: ");
			String name = in.next();
			
			System.out.print("Enter Passengers Seat Number: ");
			int seat = Integer.parseInt(in.next());
			System.out.println();
			
			System.out.println("""
					-*-*-*-VIP Bus Seats Available-*-*-*-
					--------------SEATS------------------
					""");
			for(int r = 1; r<= size; r++) {
				
				if(seat == r) {
					System.out.print(r + " [X]\t");
					continue;
				}
				else System.out.print(r + " [A]\t");
					continue;
			
			}
			System.out.println();
			System.out.println("""
					-------------------------------------
					Legend:  [A]  = Availbale
					         [X]  = Ocuppied
					""");
		}
	}
}
