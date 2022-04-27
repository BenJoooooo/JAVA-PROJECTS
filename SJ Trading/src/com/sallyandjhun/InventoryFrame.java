package com.sallyandjhun;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class InventoryFrame extends JFrame{
	
	InventoryFrame() {
		this.setTitle("Sally and Jhun Trading");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(1920,1080);
		
		ImageIcon icon = new ImageIcon("logo.png");
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(new Color(245,245,245,245));
	}
}
