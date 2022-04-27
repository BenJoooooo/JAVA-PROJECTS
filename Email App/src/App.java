import java.util.Scanner;

public class App {
	
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int defaultNumberOfPassword = 10;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "Company.com";
	private String altEmail;
	Scanner in = new Scanner(System.in);
	
	// Constructor to receive the first name and last name
	public App(String firstName, String lastName) {
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
		System.out.println("WELCOME: " + this.firstName +" "+ this.lastName);
		
		// Call a method asking for the department - returns the department
		this.department = setDepartment();
		System.out.println("YOUR DEPARMENT: " + this.department);
		
		// Call a method that returns a random password
		this.password = setPassword(defaultNumberOfPassword);
		System.out.println("YOUR PASSWORD: " + this.password);
		
		// Call a method to return the mail box capacity
		System.out.println("MAIL BOX CAPACITY: " + this.mailBoxCapacity);
		
		// Call a method to return for the alternate email
		email = firstName.toLowerCase()+ "." +lastName.toLowerCase()+ "@" +department+ "." +companySuffix;
		System.out.println("YOUR EMAIL: " + email);
		
		// Call a method to ask if want to enter an alternative email
		System.out.println("Do you want to enter a new email? Yes or No");
		char options = in.next().charAt(0);
		if (options == 'Y' || options == 'y') {
			System.out.println("ENTER YOUR NEW EMAIL: ");
			this.altEmail = alternateEmail();
			altEmail = in.next();
			System.out.println("YOUR NEW EMAIL IS: " + altEmail);
		} else {
			
		}
		
		// Call a method to ask if want to change password
		System.out.println("Do you want to change your password?");
		char options1 = in.next().charAt(0);
		if (options1 == 'Y' || options1 == 'y') {
			System.out.println("ENTER YOUR NEW PASSWORD: ");
		}
	}
	
	// Asks for the department
	private String setDepartment() {
		System.out.print("CHOOSE DEPARTMENT: \n1. ACCOUNTING\n2. FINANCE\n3. SALES\nCHOOSE ONLY ONE: ");
		int chooseDept = in.nextInt();
		
		if (chooseDept == 1) {
			return "ACCOUNTING";
		}
		else if (chooseDept == 2) {
			return "FINANCE";
		}
		else if (chooseDept == 3) {
			return "SALES";
		}
		else {
			return "";
		}
	}
	
	// Generate a password
	private String setPassword(int length) {
		String passWord = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghjklmnopqrstuvwxyz123456789!@#$%^&**()_+";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int)(Math.random()*passWord.length());
			password[i] = passWord.charAt(random);
		}
		return new String(password);
	}
	
	// Set and get the mailbox capacity
	private void mailBoxCapacity() {
		this.mailBoxCapacity = mailBoxCapacity;
	}
	private int mailBocCapacity() {
		return mailBoxCapacity;
	}
	
	// Set and get alternate email
	private void alternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	private String alternateEmail() {
		return alternateEmail;
	}
	
	// Set and get change password

	// Call a method to show all of the info
	public String showInfo() {
		return "DISPLAY NAME: "+ firstName + " " + lastName + "\nCOMPANY EMAIL: " + email +
				"\nALTERNATE EMAIL: " + altEmail + "\nMAILBOX CAPACITY: " + this.mailBoxCapacity + "mb";
	}
}
