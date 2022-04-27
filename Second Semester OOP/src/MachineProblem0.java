import java.util.Scanner;
public class MachineProblem0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter five positive values");
		
		System.out.print("Number 1: ");
		int a = in.nextInt();
		while (a < 0) {
			System.out.print("Error: Enter a non-negative value:  ");
			a = in.nextInt();
		}
		System.out.print("Number 2: ");
		int b = in.nextInt();
		while (b < 0) {
			System.out.print("Error: Enter a non-negative value:  ");
			b = in.nextInt();
		}
		System.out.print("Number 3: ");
		int c = in.nextInt();
		while (c < 0) {
			System.out.print("Error: Enter a non-negative value:  ");
			c = in.nextInt();
		}
		System.out.print("Number 4: ");
		int d = in.nextInt();
		while (d < 0) {
			System.out.print("Error: Enter a non-negative value:  ");
			d = in.nextInt();
		}
		System.out.print("Number 5: ");
		int e = in.nextInt();
		while (e < 0) {
			System.out.print("Error: Enter a non-negative value:  ");
			e = in.nextInt();
		}
		double f = a+b+c+d+e;
		System.out.println("Total is: " + f);
		System.out.println("Average is: " + (f/5));
	}
}
