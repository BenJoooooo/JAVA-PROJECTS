package Package2;

import Package1.Access1;

public class Access3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a1 = new Access1("Hello","Ben");

		// default modifier cannot give data to other package
		System.out.println();
		System.out.println();
		
		//public modifier
		System.out.println(a1.one);
		System.out.println(a1.two);
		
		//private modifier cannot give data to other class within package and to other package
		System.out.println();
	}
	
}
