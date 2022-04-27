import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyFrame() {
	this.setTitle("Jthis title goes here");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setSize(500,500);
	this.setVisible(true);
	
	ImageIcon image = new ImageIcon("1.jpg");
	this.setIconImage(image.getImage());
	this.getContentPane().setBackground(new Color(0x123456));
	}
}
