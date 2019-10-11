package babysitting;

import java.util.Scanner;

public class BabysittingRequest {
	
	public static void requestABabysitter(Mother mom) {
		
		//create a call object when two people's phone numbers are connected 
		//and cannot receive any other calls
		System.out.println("When do you need a babysitter for? ");
		Scanner keyboard = new Scanner(System.in);
		String dateNeeded = keyboard.nextLine();
		String momRequest = mom.request(dateNeeded); 
		System.out.println("Please hang on while we contact the babysitters in your area.");
		Babysitter babysitter = findABabysitter(mom.getAddress());
		System.out.println(babysitter.getName() + ", " + mom.getName() + "has submitted a request for babysitting. Here is her message:"
				+ momRequest);
		System.out.println("This is your wonderful babysitter!" + babysitter.toString());
	}
	
	public static Babysitter findABabysitter(String address) {
		//create a Babysitter object
		Babysitter babysitter = new Babysitter("Jenna","123 Grapes Lane","6453216598");
		return babysitter;
	}
	
}
