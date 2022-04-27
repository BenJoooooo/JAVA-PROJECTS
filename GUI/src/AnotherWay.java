import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class AnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image2 = new ImageIcon("1.jpg"); // Icon for the label
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); // Creates a label
		label.setText("Hello!"); // Set text of a label
		label.setIcon(image2); // Sets the icon for the label
		label.setHorizontalTextPosition(JLabel.CENTER); // Aligns the text to center horizontally
		label.setVerticalTextPosition(JLabel.TOP); // Aligns the text top vertically
		label.setForeground(new Color(0x00FF00)); // Sets the font color
		label.setFont(new Font("MV Boli",Font.PLAIN,20)); // Sets the font style
		label.setIconTextGap(0); // Sets the gap between the icon and text
//		label.setBackground(Color.black); another way to change the background color
//		label.setOpaque(true); Sets the background to visible
		label.setBorder(border); // Sets Border in the label only not frame
		label.setVerticalAlignment(JLabel.TOP); // Set vertical position of icon and text within the label
		label.setHorizontalAlignment(JLabel.CENTER); // Set horizontal position of icon and text within label
//		label.setBounds(0, 0, 300, 300); // Sets the visibility or the position of the label after setting a border manageer
		
		
		//JFrame = a GUI window to add components to
		JFrame frame = new JFrame();
		frame.setTitle("Machine Problem 0"); // Sets title of the frame
//		frame.setSize(600,600); // Sets the size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the operation
		frame.setResizable(false); // Prevents resizing of frame
		frame.setVisible(true); // Sets the visibility of the frame
//		frame.setLayout(null); // Sets the layout, the default is border
		frame.add(label); // Adds the label to the frame
		frame.pack();
		
		ImageIcon image = new ImageIcon("1.jpg"); // Icon for the frame
		frame.setIconImage(image.getImage()); // Changes the icon of the frame
		frame.getContentPane().setBackground(new Color(0x123456)); // change color of the background
		
	}

}
