import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeyc.com";
	
	// Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// call a method asking for the department - return the department
		this.department = setDepartment();
		
		// call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password );
		
		// Combine elements to generate an email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1. Sales\n2. Development\n3. Accounting\n0. None\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {
			return "Sales";
		}
		else if(depChoice == 2) {
			return "Development";
		}
		else if(depChoice == 3)	 {
			return "Accounting";
		}
		else {
			return "";
		}
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()_+";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "DISPLAY NAME: " + firstName+ " " +lastName+ 
				"\nCOMPANY EMAIL: " +email+ "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}













































