
public class Vehicle {
	
	private String color;
	private String texture;
	private int plateNumber;
	
	public Vehicle() {
		color = "Black";
		texture = "Regular";
		plateNumber = 10;
	}
	
	public Vehicle(String color) {
		this.color = color;
		texture = "rough";
		plateNumber = 11;
	}
	
	public void accelerate() {
		System.out.println("Accelerated!");
	}
}
