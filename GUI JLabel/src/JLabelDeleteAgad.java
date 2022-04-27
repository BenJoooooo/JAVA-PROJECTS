import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDeleteAgad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("IS Logo.png");
		
		JLabel label = new JLabel("Hello World!");
		label.setBounds(0, 0, 151, 151);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setIconTextGap(-80);
		label.setIcon(image);
		
		JLabel label2 = new JLabel("Akin ka na lang");
		label2.setIcon(image);
		label2.setBounds(150, 0, 150, 150);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		
		JFrame frame = new JFrame();
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(label);
		frame.add(label2);
	}

}
