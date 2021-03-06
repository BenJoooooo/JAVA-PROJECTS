
public class LessonOneClass {
	
//	properties
//	variables
	String plateNumber;
	String color;
	String manufacturer;
	int currentSpeed;
	
//	default constructor
	LessonOneClass() {
		plateNumber = "XXX000";
		color = "White";
		manufacturer = "N/A";
		currentSpeed = 0;
	}
//	overloaded constructor
	public LessonOneClass(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public LessonOneClass(String plateNumber, String color) {
		this.plateNumber = plateNumber;
		this.color = color;
	}
	public LessonOneClass(String plateNumber, String color, String manufacturer) {
		this.plateNumber = plateNumber;
		this.color = color;
		this.manufacturer = manufacturer;
	}
	public LessonOneClass(String plateNumber, String color, String manufacturer, int currentSpeed) {
		this.plateNumber = plateNumber;
		this.color = color;
		this.manufacturer = manufacturer;
		this.currentSpeed = currentSpeed;
	}
	
//	behaviors or attributes
//	methods
	public void accelerate() {
		System.out.println("Accelerated!");
	}
	public void turn() {
		System.out.println("Turned!");
	}
	public void brake() {
		System.out.println("Brake!");
	}
	
}
