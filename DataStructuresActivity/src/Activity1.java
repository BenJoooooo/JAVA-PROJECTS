import java.util.*;
public class Activity1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("INPUT STRING: ");
		String str = in.nextLine();
		System.out.print("OPTION:\n1. count number of characters"
				+ "\n2. count number of words\n3. search a substring"
				+ "\n4. replace character\n5. deleting the word"
				+ "\n6. insert a word\n7. exit\nInput: ");
		
			int options = in.nextInt();
			
			switch (options) {
			//Count String//
			case 1: System.out.print("\nNumber of Characters: " + str.length());
			break;
			//Count Words//
			case 2: System.out.print("\nNumber of words: " + countWords(str));
			break;
			//Search a substring//
			case 3: System.out.print("\nInput key to be search: ");
			String subs = in.next();
			System.out.print("Result: Found in index " + str.indexOf(subs));
			break;
			//Replace a character//
			case 4: System.out.print("\nInput a character to be replace: ");
			String rep = in.next();
			System.out.print("Replace with: ");
			String rep2 = in.next();
			System.out.print("Result: " + str.replace(rep, rep2));
			break;
			//Delete word//
			case 5: System.out.print("\nWord to be delete: ");
			String toBeDelete = in.next();
            System.out.print("result : ");
            if(str.contains(toBeDelete))
                System.out.print(str.replace(toBeDelete, ""));
            else 
                System.out.printf("%s Not found", toBeDelete);
			break;
			//Insert word//
			case 6: System.out.print("\nWord to be insert: ");
			String ins = in.next();
			System.out.print("After index: ");
			int after = in.nextInt();
			System.out.print("Result" + insertString(str,ins,after));
			break;
			//Exit//
			case 7: System.out.print("\nProgram terminated");
			System.exit(options);
			break;
			}
		}
	//Number of words//
	public static int countWords(String input) {
		String[] words = input.split("\\s");
		return words.length;	
	}
	//Delete a word//

	//Insert a string//
	public static String insertString(String original, String toBeInsert, int index) {
		String newString = original.substring(0,index + 1)
				+ toBeInsert
				+ original.substring(index + 1);
		return newString;
	}
}
