import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class JPanell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Border border = BorderFactory.createLineBorder(Color.black,3);
		ImageIcon image = new ImageIcon("IS Logo.png");
		
		JLabel label = new JLabel("Hi!");
		label.setIcon(image);
		label.setBounds(3, 0, 75, 75);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		panel.setBounds(0, 0, 250, 250);
		panel.setBorder(border);
		panel.setLayout(null);
		panel.add(label);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.blue);
		panel2.setBounds(250, 0, 250, 250);
		panel2.setBorder(border);
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.GREEN);
		panel3.setBounds(0,250,500,250);
		panel3.setBorder(border);
		panel3.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
	}

}
