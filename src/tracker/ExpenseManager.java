package tracker;

import java.util.ArrayList;

public class ExpenseManager {
	private ArrayList<String> descriptions;
	private ArrayList<Double> amounts;
	private ArrayList<String> categories;

	public ExpenseManager() {
		descriptions = new ArrayList<>();
		amounts = new ArrayList<>();
		categories = new ArrayList<>();
	}

	public void addExpense(String desc, double amount, String category) {
		descriptions.add(desc);
		amounts.add(amount);
		categories.add(category);		
		System.out.println("Expense added !");
	}

	public void viewExpense() {
		System.out.println("\nExpense List...");
		for (int i = 0; i < descriptions.size(); i++) {
			System.out.println((i + 1) + ". " + descriptions.get(i) + " - rs." + amounts.get(i) +" (" + categories.get(i) + ")");
		}
	}

	public double getTotal() {
		double total = 0;
		for (double amt : amounts) {
			total += amt;
		}
		return total;
	}
}
