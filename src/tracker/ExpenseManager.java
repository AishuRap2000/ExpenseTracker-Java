package tracker;

import java.util.ArrayList;

public class ExpenseManager {
	// storing variables in list
	private ArrayList<String> descriptions;
	private ArrayList<Double> amounts;
	private ArrayList<String> categories;

	// constructor ---> when create an expenseManager obj, it initializes those
	// lists
	public ExpenseManager() {
		descriptions = new ArrayList<>();
		amounts = new ArrayList<>();
		categories = new ArrayList<>();
	}

	// adding new expenses
	public void addExpense(String desc, double amount, String category) {
		descriptions.add(desc);
		amounts.add(amount);
		categories.add(category);
		System.out.println("Expense added !");
	}

	// print s all amounts lists and returns the sum
	public void viewExpense() {
		System.out.println("\nExpense List...");
		for (int i = 0; i < descriptions.size(); i++) {
			System.out.println(
					(i + 1) + ". " + descriptions.get(i) + " - rs." + amounts.get(i) + " (" + categories.get(i) + ")");
		}
	}

	//loops via amount list and return sum
	public double getTotal() {
		double total = 0;
		for (double amt : amounts) {
			total += amt;
		}
		return total;
	}
}
