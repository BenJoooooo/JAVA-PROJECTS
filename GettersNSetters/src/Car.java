
public class Car extends Vehicle{

	private String brand;
	private String size;
	
	public Car() {
		super("red");
		brand = "Toyoyta";
		size = "Small";
	}
	
	public void playMusic() {
		System.out.println("Play music!");
	}
}
