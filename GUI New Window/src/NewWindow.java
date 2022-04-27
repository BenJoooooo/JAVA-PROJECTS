import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!");
	
	NewWindow() {
		
		frame.add(label);
		label.setBounds(0, 0, 100, 40);
		label.setFont(new Font(null,Font.PLAIN,25));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(420,420);
		
	}
}
