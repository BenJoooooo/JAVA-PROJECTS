import java.util.Scanner;
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to the Banking Application!");
		System.out.println("Our operations: ");
		System.out.println("Click 1 for exiting from system");
		System.out.println("Click 2 for money transfer");
		System.out.println("Click 3 to get money");
		int operation = in.nextInt();
		
		if (operation == 1) {
			System.out.println("Exiting from system");
			System.exit(0);
		}
		else if (operation == 2) {
			System.out.println("You chose money transfering, you can transfer money");
			System.out.println("How much money do you have?");
			int balance = in.nextInt();
			System.out.println("How much money do you want to transfer?");
			int transfer = in.nextInt();
			if (balance <= transfer) {
				System.out.println("Insufficient balance remaining,thank you!");
			}
			else {
				System.out.println("You have transferred: " + transfer);
				System.out.println("Remaining balance: " + (balance - transfer));
			}
		}
		else if (operation == 3) {
			System.out.println("Enter your balance: ");
			int balance = in.nextInt();
			System.out.println("How much money you want to get: ");
			int getMoney = in.nextInt();
			if (balance <= getMoney) {
				System.out.println("Insufficient balance remaining, thank you!");
			}
			else {
				System.out.println("Your new balance: " + (balance - getMoney));
			}
		}
		else {
			System.out.println("Invalid operation!");
		}
		
	}

}
