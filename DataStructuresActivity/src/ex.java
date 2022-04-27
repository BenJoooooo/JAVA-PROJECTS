import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ex {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		int a = 2;
		a *= 5;
		System.out.println(a);
		
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("JAVA");
		listOfNames.add("GOAL");
		listOfNames.add("ACHIEVED");
		boolean isRemoved = listOfNames.remove("GOAL");
		System.out.println("Removed Successfully " + isRemoved);
		System.out.print(listOfNames);
		
		for (int i = 0; i <=5 ; i++) {
			System.out.println("Hello");	
		}
		int b = 10;
		int c = 20;
		
		if (b > 12 || c < 18) {
			System.out.print("Hello World");
		}
		else {
			System.out.print("Tanginang buhay to");
		}
		
		int num = bucky.nextInt();
		
		switch (num) {
		case 1: System.out.print("Hello shit!");
				break;
		case 2: System.out.print("Hello fuck!");
				break;
		case 3: System.out.print("Hello bullshitfucking world!");
		}
	}
}

