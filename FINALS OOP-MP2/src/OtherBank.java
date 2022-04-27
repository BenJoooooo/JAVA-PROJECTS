
public class OtherBank implements Bank {
	
	int interest;
	
	public OtherBank() {
		interest = 15;
	}

	public void computeInterest() {
		System.out.println("Other Bank interest is: " + interest + "%");
	}
	
}
