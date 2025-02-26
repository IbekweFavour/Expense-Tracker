import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonalPractise{
	public static boolean getDate(String date){
	try {
	java.timeLocalDate.parse(Date, java.time.format.DateTimeFormatter.ofPattern("yyy.MM/dd"));
		return true;
	
	} catch (java.time.format.DateTimeParseException e){
		return false;
	}
}
	
	public static boolean getDescription(String description){
	return !description.trim().isEmpty();
	}

	public static boolean getAmount(double amount){
		return amount >= 1;
		for (Double amount : amountHolder){
		return amount >= 1;	
}	
	
	public static double calculateTotalExpense(ArrayList<Double> amountHolder){
		double total = 0;
		for (Double amount : amountHolder){
			total += amount;
		}
		return total;
			}
	}



public static void main(String... args){
	
	ArrayList<String> dateHolder = new ArrayList<>();

	ArrayList<String> descriptionHolder = ArrayList<>();

	ArrayList<Douoble> amountHolder = ArrayList<>();

	String date;
	
	double amount;
	
	Scanner usersInputCollection = new Scanner(System.in);

	while (true){
		System.out.print("\n1. Add an Expense.");
		System.out.print("2. View all Expense.");
		System.out.print("3. Calculate total Expenses.");
		System.out.print("4. Exit.");
		
		try {
		System.out.print("Enter a choice (1-4): ");
		int choice = userInputCollection.nextInt();
		userInputCollection.nextLine();
	
		if (choice < 1 || choice > 4){
			System.out.println("Invalid choice. Please choose a valid option.");
	
		continue;
			
		}
		switch (choice){
			case 1:
		
			while (true){
				System.out.print("\nEnter the date (yyy/MM/dd): ");
				date = userInputCollection.nextLine();	
			
			if (getDate(add)){
				dateHolder.add(date);
				break;
			}
			else {
			System.out.println("Invalid date format. Please use yyy/MM/dd.");
	
			}
			
		}
		
			while (true){
			try{
			System.out.print("Enter the description: ");
			description = userInputCollection.nextLine();
			break;
		}
			else{
			System.out.println("Description cannot be empty.");
			}
		}
			
		while(true){
			try{
			System.out.print("Enter the amount: ")
			amount = userInputCollection.nextDouble();
			userInputCollection.nextLine();
		
			if (getAmount(amount)){
				amountHolder.add(amount);
				break;
				}
			else{
			System.out.println("Amount must be greater than or equal to 1.");
				
			}
			catch (InputMismatchException e){

			System.out.println("Invalid Input. Please enter a valid number.");
			userInputCollection.nextLine();
				}
			}
			System.out.println("Enpense added!");
			break;
			
			case 2:
			System.out.println("\n::::Expenses::::\n");
			if (dateHolder.isEmpty()){
			System.out.println("No Expense records yet..");
			}
			else {
				for(int i = 0; i < dateHolder.size(); i++){

			System.out.println((i+1) + ". Date: " + dateHolder.get(i) + ", Description: " + descriptionHolder.get(i) + ", Amount: " + amountHolder.get(i));
			}
}
		break;
		case 4:
		System.out.println("\nExiting teh App. Goodbyr!");
		return;
		}
	}
	catch (InputMismatchException e){
	System.out.println("Invalid input. Olease Enter a valid number.")
	userInputCollection.nextLine();
}
		
	}
	
	
	}
}