
public class MyBank implements Bank {
	
	int interest;
	
	public MyBank() {
		interest = 10;
	}

	@Override
	public void computeInterest() {
		// TODO Auto-generated method stub
		System.out.println("The interest for MyBank is: " + interest + "%");
	}
	
	
}
