package Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	JFrame frame; 
	JPanel panel;
	JButton button;
	JButton button2;
	JButton button3;
	JButton button4;
	JTextField textfield;
	JTextField text;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void calc(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JTextField textfield = new JTextField();
		JTextField text = new JTextField();
		frame.add(panel);
		panel.add(button);
		panel.add(button);
		panel.add(button);
	}
}
