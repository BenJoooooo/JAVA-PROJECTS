
class Vehicle {
	
	int maxSpeed = 120;
	
}

class Car extends Vehicle {
	
	int maxSpeed = 100;
	
	public void Display() {
		System.out.println(super.maxSpeed);
	}
	
}
