package test;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

import javax.swing.*;

public class gui extends JFrame {
	private JPanel mousePanel;
	private JLabel statusbar;
	
	public gui() {
		super("My title");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("Default");
		add(statusbar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d,%d", event.getX(),event.getY()));
		}
		public void mousePressed(MouseEvent event) {
			statusbar.setText("You pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("You released the button");
		}
		public void mouseEntered(MouseEvent event) {
			statusbar.setText("You entered the area");
			mousePanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			statusbar.setText("The mouse has left the window");
			mousePanel.setBackground(Color.WHITE);
		}
		
		// these are mouse motion event
		@Override
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("You are dragging the mouse");
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			statusbar.setText("You moved the mouse");
		}
	}
}
