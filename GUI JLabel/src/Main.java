import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("1.jpg");
		Border border = BorderFactory.createLineBorder(Color.white,3);
		
		JLabel label = new JLabel(); // create a label
		label.setText("Bro, do you even code?"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text left,center, right of imageicon
		label.setVerticalTextPosition(JLabel.TOP); // set text top, center, bottom of imageicon
		label.setForeground(new Color(0x123456)); // set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN, 20)); // set font of text
		label.setIconTextGap(0); // set gap of text to image
		label.setBackground(Color.black); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
		// label.setBounds(100, 100, 250, 250); // set x,y position within frame as well as dimensions
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		// frame.setSize(500,500);
		// frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.pack();
	}

}
