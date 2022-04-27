import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsOnWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence ="Hello World I am Ben Joshua";
		Scanner in = new Scanner(sentence);
		
		ArrayList<String> words = new ArrayList<String>();
		while(in.hasNext()) {
			words.add(in.next());
		}
		System.out.println(words);
	}

}
