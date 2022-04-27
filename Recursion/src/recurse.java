
public class recurse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	public static int factorial(int n) {
		if (n == 1) {
			System.out.println("Factorial (" + n + ") = 1");
			return 1;
		}
		else {
			System.out.println("Factorial (" + n + ") = " + n + " * factorial (" + (n-1) + ")");
			return n * factorial(n-1);
		}
	}

}
