import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "really?", "Title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Your computer has a virus", "Title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!", "Title", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showConfirmDialog(null, "Bro do you even Code?", "Here is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		
//		String name = JOptionPane.showInputDialog("What is your name?: ");
//		System.out.println("hello " + name);
		
		String[] responses = {"No, you are awesome", "Thank you!", "Blush*"};
		ImageIcon icon = new ImageIcon("1.jpg");
		JOptionPane.showOptionDialog(
				null,
				"You are awesome",
				"Secret Message",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				responses,
				0);
		
	}
}
