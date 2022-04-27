
public class MyBank implements Bank {
	
	int interest;
	
	public MyBank() {
		interest = 10;
	}
	
	public void computeInterest() {
		System.out.println("My Bank interest is: " + interest + "%");
	}
	
}
