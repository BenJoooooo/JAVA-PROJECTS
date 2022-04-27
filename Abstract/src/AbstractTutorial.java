
abstract class Dog {
	
	public static void bark() {
		System.out.println("Dog Barked!");
	}
	
	public static void poop() {
		System.out.println("Dog Pooped!");
	}
	
	public abstract void howl();
	
}

class Chihuahua extends Dog {
	public void howl() {
		System.out.println("awuuu!");
	}
}

public class AbstractTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chihuahua c = new Chihuahua();
		c.bark();
		c.poop();
		c.howl();
	}

}
