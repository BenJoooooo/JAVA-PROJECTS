import java.util.Scanner;

public class ChangeTwoNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNum = in.nextInt();
		System.out.println("Enter second number: ");
		int secondNum = in.nextInt();
		int temp = 0;
		
		temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		
		System.out.println("First number: " + firstNum);
		System.out.println("Second number: " + secondNum);
		
	}
}
