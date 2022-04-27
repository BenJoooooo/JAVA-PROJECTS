import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class MachineProblem0WithGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("1.jpg");
		int one,two,three,four,five,sum,quo;
		String text;
		text = JOptionPane.showInputDialog("Enter number 1: ");
		one = Integer.parseInt(text);
		text = JOptionPane.showInputDialog("Enter number 2: ");
		two = Integer.parseInt(text);
		text = JOptionPane.showInputDialog("Enter number 3: ");
		three = Integer.parseInt(text);
		text = JOptionPane.showInputDialog("Enter number 4: ");
		four = Integer.parseInt(text);
		text = JOptionPane.showInputDialog("Enter number 5: ");
		five = Integer.parseInt(text);
		
		sum = (one+two+three+four+five);
		quo = sum/5;
		JOptionPane.showMessageDialog(null, "The sum of the five numbers is: " + sum);
		JOptionPane.showMessageDialog(null, "The average is: " + quo);
	}
}
