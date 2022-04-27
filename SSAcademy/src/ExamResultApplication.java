import java.util.Scanner;
public class ExamResultApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the exam result!");
		System.out.println("Enter your first exam result: ");
		int first_result = in.nextInt();
		System.out.println("Enter you second exam result: ");
		int second_result = in.nextInt();
		
		if (first_result > 50 && second_result > 50) {
			System.out.println("You got best college degree!");
		}
		else if (first_result > 50|| second_result > 50) {
			System.out.println("You got good grades!");
		}
		else {
			System.out.println("Sorry, you can not get a college degree");
		}
	}

}
