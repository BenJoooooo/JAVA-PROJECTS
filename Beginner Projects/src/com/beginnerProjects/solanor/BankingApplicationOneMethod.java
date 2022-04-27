package com.beginnerProjects.solanor;
import java.util.Scanner;

public class BankingApplicationOneMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int options,balance = 0, amount, balance1,deposit,updatedBalance;
		char opt;
		do {
			
		// Banking Application using only ONE method
		Scanner in = new Scanner (System.in);
		System.out.println("WELCOME TO BENJO BANK!\n");
		
		// Prompts the user to choose transaction
		System.out.println("Please choose your transaction in the options below: ");
		System.out.println(" 1. Deposit\n 2. Withdraw\n 3. Check my balance\n 4. Exit");
		options = in.nextInt();
		
			switch (options) {
			// Deposit
			case 1: System.out.println("You chose deposit");
					System.out.println("How much will you deposit?");
					deposit = in.nextInt();
					balance = deposit + balance;
					System.out.println("Updated Balance: " + balance);
					System.out.println("Would you like another transaction? Y for Yes and N for No");
					opt = in.next().charAt(0);
					if (opt == 'N' || opt == 'n') {
						System.out.println("Thank you for choosing us!");
						System.exit(options);
					}
					break;
			// Withdraw
			case 2: System.out.println("You chose withdraw");
					System.out.println("How much will you withdraw?");
					amount = in.nextInt();
					if (balance <= 0) {
						System.out.println("You have no funds!");
					}
					else if (balance < amount) {
						System.out.println("Insufficient funds!");
					}
					else if (balance >= amount) {
						balance = balance - amount;
						System.out.println("You have withdrawn: " + amount);
						System.out.println("Remaining Balance: " + balance);
						System.out.println("Would you like another transaction? Y for Yes and N for No");
						opt = in.next().charAt(0);
						if (opt == 'N' || opt == 'n') {
							System.out.println("Thank you for choosing us!");
							System.exit(options);
						}
					}
					break;
			// View balance
			case 3: System.out.println("You chose to view your balance");
					System.out.println("Remaining balance is: " + balance);
					
					System.out.println("Would you like another transaction? Y for Yes and N for No");
					opt = in.next().charAt(0);
					if (opt == 'N' || opt == 'n') {
						System.out.println("Thank you for choosing us!");
						System.exit(options);
					}
					break;
			// Terminate program
			case 4: System.out.println("Thank you for choosing us!");
					System.exit(options);
					// End of switch code
			}
		} while (options != 5); // Loop the transaction up to 5 times
	}
} // End of code 
  // Programmer: Ben Joshua Solanor
