import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class PracticeDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("1.jpg");
		Border border = BorderFactory.createLineBorder(Color.green,2);
		
		JLabel label = new JLabel();
		label.setText("Bro, do you even code?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setIconTextGap(-100);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setBounds(0, 0, 250, 250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500,500);
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}
}
