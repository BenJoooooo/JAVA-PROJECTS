
public abstract class Animal {
	protected int legs;
	
	protected Animal() {
		legs = 8;
	}
	
//	Setters and Getters are optional
//	for me as the attribute is already initialized
//	at the default constructor
	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	public abstract void eat();
	
	public void walk() {
		System.out.println("The animals walk with " + this.legs + " number of legs");
	}
}
