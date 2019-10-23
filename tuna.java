package test;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// extends means inherits all the methods and variables of JFrame
// static means every object shares the same variable.
// so if variable change, means variable change for all objects
public class tuna extends JFrame{
	private JLabel item1;
	
	public tuna() {
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		// setToolTipText shows something up on hover
		item1.setToolTipText("This is gonna show up on hover");
		add(item1);
	}
}
