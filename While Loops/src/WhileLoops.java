
public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doWhile();
		WhileLoop();
		
	}
	
	public static void doWhile() {
		
		int counter = 1;
		
		do {
			System.out.println("a");
			counter++;
		} 
		while (counter <=5 );
	}
	
	public static void WhileLoop() {
		int counter = 1;
		
		while (counter <= 5) {
			System.out.println("Hello: " + counter);
			counter++;
		}
	}
}
