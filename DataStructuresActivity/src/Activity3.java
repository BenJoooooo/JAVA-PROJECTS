import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input String 1: ");
		String word = in.next();
		System.out.print("Input String 2: ");
		String word1 = in.next();
		String word3 = word1;
		System.out.print("OPTION:\n1. String copy"
				+ "\n2. String concatenation\n3. String Comparison"
				+ "\n4. Reverse the first string input"
				+ "\n5. Second input string Conversion \nUppercase to Lowercase & Lowecase to Uppercase)"
				+ "\n6. Exit \nInput: ");
		int options = in.nextInt();
		
		int n=1;
		String arr[] = new String[2];
		for(int i=0; i<2; i++) {
		System.out.print("Input String " + n + ": ");
		arr[i] = in.nextLine();
		n++;

		switch(options) {
		case 1: System.out.println("Choose a string number: ");
				int copy = in.nextInt();
				String str3 = arr[copy-1];
				System.out.print("String "+ (copy+=1) + " is: ");
		break;
		case 2: System.out.print("Output: " + word +" "+ word1);
		break;
		case 3: System.out.print("String Comparison");
		break;
		case 4:String r = reverse(word);
		break;
		case 5:
		break;
		case 6: System.out.print("Program terminated");
				System.exit(options);
		break;
		}
	}
}
	public static String reverse (String s) {
		char [] letters = new char[s.length()];
		for (int i = s.length() -1; i >= 0 ; i--) {
			System.out.print(s.charAt(i));
		}
			return s;
	}
	
}
