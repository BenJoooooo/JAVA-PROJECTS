import java.util.Scanner;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Welcome to summoners rift", "Ewan ko na lang",JOptionPane.PLAIN_MESSAGE);
		String Prelim, Midterm, Semi_Final,Final;
		int PrelimGrade,MidtermGrade,Semi_FinalGrade,FinalGrade;
		double AverageGrade;
		
		Prelim = JOptionPane.showInputDialog(null, "Enter your prelim grade: ", "Grading System", JOptionPane.PLAIN_MESSAGE);
		Midterm = JOptionPane.showInputDialog(null, "Enter your midterm grade: ", "Grading System", JOptionPane.PLAIN_MESSAGE);
		Semi_Final = JOptionPane.showInputDialog(null, "Enter your semi-final grade: ", "Grading Ssytem", JOptionPane.PLAIN_MESSAGE);
		Final = JOptionPane.showInputDialog(null,"Enter your final grade: ", "Grading System", JOptionPane.PLAIN_MESSAGE);
		
		PrelimGrade = Integer.parseInt(Prelim);
		MidtermGrade = Integer.parseInt(Midterm);
		Semi_FinalGrade = Integer.parseInt(Semi_Final);
		FinalGrade = Integer.parseInt(Final);
		
		AverageGrade = (PrelimGrade + MidtermGrade + Semi_FinalGrade + FinalGrade) / 4;
		JOptionPane.showMessageDialog(null, "Your Average is: " + AverageGrade, "Better luck next" , JOptionPane.PLAIN_MESSAGE);
		
	}
}