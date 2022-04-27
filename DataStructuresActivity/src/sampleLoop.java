import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;
public class sampleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter size of array: ");
		int num = in.nextInt();
		int ar[] = new int[num];
		
		for (int loop = 0; loop < ar.length; loop++) {
			System.out.println("Enter number base on length: ");
			int array = in.nextInt();
			ar[loop] = array;
		}
		System.out.println("Enter number to search: ");
		int num1 = in.nextInt();
		Output(num1, ar.length,ar);
	}
	
	public static void Output(int me1, int me2, int array[]) {
		int search = 0;
		for (int loop2 = 0; loop2 < me2; loop2++) {
			if (me1==array[loop2]) {
				search = search+1;
			}
		}
		System.out.println("Number occured: " + search);
	}
}
