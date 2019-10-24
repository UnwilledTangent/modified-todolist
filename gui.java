package test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class gui extends JFrame {
	private JComboBox box;
	private JLabel picture;
	
	private static String[] filename = {"b.png","x.jpg"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
	
	public gui() {
		super("The Title");
		setLayout(new FlowLayout());
		
		// automatically puts filename list in a combo box
		box = new JComboBox(filename);
		
		box.addItemListener(
				new ItemListener() {
					@Override
					public void itemStateChanged(ItemEvent event) {
						// Whatever you select
						if(event.getStateChange()==ItemEvent.SELECTED)
							picture.setIcon(pics[box.getSelectedIndex()]);
					}
				}
		);
		
		add(box);
		picture=new JLabel(pics[0]);
		add(picture);
	}
}
