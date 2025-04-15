package tracker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	public void addExpense(String desc, double amount, String category) throws IOException {
		descriptions.add(desc);
		amounts.add(amount);
		categories.add(category);
		System.out.println("Expense added !");

		// saving this to a file
		try (FileWriter writer = new FileWriter("expenses.txt", true)) {
			writer.write(desc + "," + amount + "," + category + "\n");
		} catch (IOException e) {
			System.out.println("Err writing t o a file: " + e.getMessage());
		}
	}

	// print s all amounts lists and returns the sum
	public void viewExpense() {
		System.out.println("\nExpense List...");
		for (int i = 0; i < descriptions.size(); i++) {
			System.out.println(
					(i + 1) + ". " + descriptions.get(i) + " - Rs. " + amounts.get(i) + " /- , (" + categories.get(i) + ")");
		}
	}

	// loops via amount list and return sum
	public double getTotal() {
		double total = 0;
		for (double amt : amounts) {
			total += amt;
		}
		return total;
	}

	public void viewFromFile() throws IOException {
		System.out.println("\n Saved Expenses from File ");
		try (BufferedReader br = new BufferedReader(new FileReader("expenses.txt"))) {
			String line;
			int count = 1;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 3) {
					System.out.println(count + ". " + parts[0] + ". Rs. " + parts[1] + " (" + parts[2] + ")");
					count++;
				}
			}
		} catch (IOException e) {
			System.out.println("Err reading file: " + e.getMessage());
		}
	}
}

