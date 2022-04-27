
public class OtherBank implements Bank {
	
	int interest;
	
	public OtherBank() {
		interest = 15;
	}
	
	@Override
	public void computeInterest() {
		// TODO Auto-generated method stub
		System.out.println("The interest rate for OtherBank is: " + interest + "%");
	}
	
	
	
}
