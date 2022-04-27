import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, sum;
		
		while (true) {
			try {
//				accept input
				System.out.print("Enter number 1: ");
				num1 = scan.nextInt();
				
				System.out.print("Enter number 2: ");
				num2 = scan.nextInt();
				
//				display output
				sum = num1+num2;
				System.out.println("The sum is: " + sum);
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter an integer input");
				scan.next();
			}
			catch (ArithmeticException ae) {
				System.out.println("Please enter a correct integer values");
				scan.next();
			}
			finally {
				System.out.println("terminated the program");
			}
		}
	}
}
 