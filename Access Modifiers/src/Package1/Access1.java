package Package1;

public class Access1 {

	// default modifier
	int hours = 3;
	int minutes = 10;
	
	// public modifier
	public String one = "Hello";
	public String two = "World";
	
	// private modifier
	private String three = "My name is";
	private String four = "Ben Joshua";
	
	public Access1(String three, String four) {
		this.three = three;
		this.four = four;
		System.out.println(this.three+this.four);
	}
}
