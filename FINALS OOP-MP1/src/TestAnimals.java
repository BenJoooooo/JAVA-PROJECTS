
public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spider s = new Spider();
		System.out.println(s.getLegs());
		s.eat();
		s.walk();
		System.out.println();
		
		Fish f = new Fish();
		f.eat();
		f.walk();
	}

}
