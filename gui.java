package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class gui extends JFrame {
	private JButton reg;
	private JButton custom;
	
	public gui() {
		super("The title");
		setLayout(new FlowLayout());
		
		reg = new JButton("reg Button");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon x = new ImageIcon(getClass().getResource("x.jpg"));
		custom = new JButton("Custom", b);
		custom.setRolloverIcon(x);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
}
