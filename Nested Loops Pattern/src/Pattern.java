import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.println("How many stars? ");
		int a = in.nextInt();
		
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = a - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
