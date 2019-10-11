package babysitting;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//create a mother object
		Mother mom = new Mother("Sara",5,"123 Cherry Lane","8175659874");
		int callCount = 0; 
		System.out.println("Do you need a babysitter? Y/N");
		String reply = keyboard.nextLine().toLowerCase();
		if (reply == "y" | reply == "yes" | reply == "yeah") {
			BabysittingRequest.requestABabysitter(mom);
		}
		else {
			System.out.println("We offer the fastest connection to the best babysitters in your area. "
					+ "Looking forward to helping you next time! ");
		}
		
	}
}
