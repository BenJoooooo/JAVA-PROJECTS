
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = reverse("Hello");
		System.out.println(r );
	}
	
	// Method for the reverse function
	public static String reverse(String s) {
		// declare the number of characters in an array Char data type
		char letters[] = new char[s.length()];
		
		// the last index will be placed to first index which is zero
		int letterIndex = 0;
		
		/* This for loop will reverse the string, the letters that stores
		 * the reversed string will go back to 0 index
		 * the letterIndex is for the increment
		 */
		for (int i = s.length() - 1; i >= 0; i--) {
			letters[letterIndex] = s.charAt(i);
			letterIndex++;
		}
		/* The reverse string will be just for the placement of the
		 * reverse letters and construct a string
		 */
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			reverse = reverse + letters[i];
		}
		
		return reverse;
	}

}
