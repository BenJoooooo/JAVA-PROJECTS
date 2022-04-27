
public class CompositionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birthday b = new Birthday(06,25,2000);
		CompositionBirthday cb = new CompositionBirthday("Ben", b);
		
		System.out.println(cb);
	}

}
