import java.util.Random;
import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Number from 0 - " + a);
		
		Random roll = new Random();
		int b = roll.nextInt(a);
		
		System.out.println(b);
	}

}
