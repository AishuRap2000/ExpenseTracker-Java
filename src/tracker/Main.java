package tracker;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExpenseManager manager = new ExpenseManager();
		Scanner s = new Scanner(System.in); // displays menu and takes user input for choice
		int choice;
		System.out.println("Expense Tracker");
		do {
			System.out.println("\n1. Add Expense\n2. View Expense\n3. View Total\n4. Exit");
			System.out.println("Enter your choice :- ");
			choice = s.nextInt();
			s.nextLine();
			
			switch(choice) { // swicth cases
			case 1:
				System.out.println("Enter description: ");
				String desc = s.nextLine();
				System.out.println("Enter amount: ");
				double amount = s.nextDouble();
				System.out.println("Enter category (example. Food, Travel, Bills): ");
				String category = s.nextLine();
				manager.addExpense(desc, amount, category);
				break;
			case 2:
				manager.viewExpense();
				break;
			case 3:
				System.out.println("Total: Rs" + manager.getTotal());
				break;
			case 4:
				manager.viewFromFile();
				break;
			case 5:
				System.out.println("Exiting...");
				break;
				default:
					System.out.println("Invalid choice! ");
			}
		} while (choice != 5);
		s.close();
	}

}
