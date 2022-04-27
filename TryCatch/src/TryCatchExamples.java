import java.util.Scanner;

public class TryCatchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] a = {4};
			System.out.println(a[1]);
			
		} catch (NullPointerException e) {
			System.out.println("Your array is null");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Your array is out of bounds");
		} catch (Exception e) {
			System.out.println("Something else went wrong");
		}
	}
}
