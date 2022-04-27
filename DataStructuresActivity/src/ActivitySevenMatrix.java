import java.util.Scanner;
public class ActivitySevenMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = in.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = in.nextInt();
		
		int matrix [][] = new int [rows][cols];
		System.out.println("Enter elements: ");
		
		
		for (int i = 0; i < rows; i++) {
			for (int n = 0; n < cols; n++) {
				matrix [i][n] = in.nextInt();
			}
		}
		
		//Printing matrix input
		System.out.println("Print the input matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int n = 0; n < cols; n++) {
				System.out.println(matrix[i][n] + "\t");
			}
			System.out.println();
		}
		
		//Checking input matrix for symmetric
		if (rows != cols) {
			System.out.println("Not symmetric");
		} else {
			boolean symmetric = true;
			
			for (int i = 0; i < rows ; i++) {
				for (int n = 0; i < cols ; i++) {
					if (matrix [i][n] != matrix [n][i]) {
						symmetric = false;
						break;
					}
				}
			}
			if (symmetric) {
				System.out.println("Matrix is symmetric");
			} else {
				System.out.println("Matrix asymmetric");
			}
		}
		in.close();
	}
}
