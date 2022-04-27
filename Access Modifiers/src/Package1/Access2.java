package Package1;

public class Access2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a1 = new Access1("Hello"," World!");
		
		// default modifier
		System.out.println(a1.hours);
		System.out.println(a1.minutes);
		
		//public modifier
		System.out.println(a1.one);
		System.out.println(a1.two);
		
		//private modifier cannot give data to other class within package and to other package
		System.out.println();
	}

}
