
public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "How many duplicates are there?";
		
		String characters = "";
		String duplicates = "";
		
		for(int i = 0; i < sentence.length(); i++) {
			characters += sentence.charAt(i);
			System.out.println(characters);
		}
	}

}
