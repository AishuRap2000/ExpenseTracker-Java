package tracker;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpenseManager manager = new ExpenseManager();
		Scanner s = new Scanner(System.in);
		int choice;
		System.out.println("Expense Tracker");
		do {
			System.out.println("\n1. Add Expense\n2. View Expense\n3. View Total\n4. Exit");
			System.out.println("Enter your choice :- ");
			choice = s.nextInt();
			s.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter description: ");
				String desc = s.nextLine();
				System.out.println("Enter amount: ");
				double amount = s.nextDouble();
				manager.addExpense(desc, amount);
				break;
			case 2:
				manager.viewExpense();
				break;
			case 3:
				System.out.println("Total: Rs" + manager.getTotal());
				break;
			case 4:
				System.out.println("Exiting...");
				break;
				default:
					System.out.println("Onvalie chpice! ");
			}
		} while (choice != 4);
		s.close();
	}

}
