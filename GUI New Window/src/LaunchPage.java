import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton("New Window!");
	
	LaunchPage() {
		
		button.setBounds(100, 160, 200, 40);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			frame.dispose();
			NewWindow newWindow = new NewWindow();
		}
	}
}
