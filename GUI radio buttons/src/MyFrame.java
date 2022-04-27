import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ImageIcon icon;
	ImageIcon icon2;
	ImageIcon icon3;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		icon = new ImageIcon("1.jpg");
		icon2 = new ImageIcon("1.jpg");
		icon3 = new ImageIcon("1.jpg");
		
		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		hotdogButton = new JRadioButton("Hotdog");
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(icon);
		hamburgerButton.setIcon(icon2);
		hotdogButton.setIcon(icon3);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza!");
		}
		else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered hamburger");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You orderd a hotdog");
		}
	}
}
