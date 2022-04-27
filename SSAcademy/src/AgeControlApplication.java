import java.util.Scanner;
public class AgeControlApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the age control application!");
		System.out.println("Enter Age: ");
		int age = in.nextInt();
		
		if (age > 50 && age <= 100) {
			System.out.println("You are so old!");
		} 
		else if (age >= 18 && age <= 50) {
			System.out.println("You are an adult!");
		}
		else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager!");
		}
		else {
			System.out.println("You are either a toddler or an ancient one!");
		}
	}

}