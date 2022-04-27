
public class PracticeRandomPasswordGenerator {

	String password;
	static int defaultPassword = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = randomPassword(defaultPassword);
		System.out.println("Your new password: " + password);
	}
	
	private static String randomPassword(int length) {
		String setPassword = " ABCDEEFGHJKLIMNOPQRSTUVWXYZ123456789!@#$%^&*()_+abcdefghjklmnopqrstuvwxyz";
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++) {
			int random = (int)(Math.random() * setPassword.length());
			password[i] = setPassword.charAt(random);
		}
		return new String (password);
		
	}
	
}
