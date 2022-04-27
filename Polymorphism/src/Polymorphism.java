class Bird {
	
	public void sing() {
		System.out.println("Tweet tweet!");
	}
	
}
class Robin extends Bird {
	public void sing() {
		System.out.println("Twiddle dee dee");
	}
}
class Pelican extends Bird {
	public void sing() {
		System.out.println("Kwahh Kwahh");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		Robin r = new Robin();
		Pelican p = new Pelican();
		
		b.sing();
		r.sing();
		p.sing();
	}

}
