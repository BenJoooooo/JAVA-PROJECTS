
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock(3,30,59);
		// Calls a method that returns the current timee
		System.out.println(c.getTime());
		
		// Test if all methods work properly
		c.setHr(1);
		c.setMin(20);
		c.setSec(59);
		System.out.println("Test for method: hr - " + c.getHr());
		System.out.println("Test for method: min - " + c.getMin());
		System.out.println("Test for method: sec - " + c.getSec());
	} 
}
