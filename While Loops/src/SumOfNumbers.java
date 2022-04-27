import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Enter a positive number: ");
		int num = in.nextInt();
		
		while (num >= 0) {
			sum += num;
			System.out.println("Enter a number: ");
			num = in.nextInt();
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: ");
		in.close();
	}

}
