package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BinaryStuff implements ActionListener {
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JButton button = new JButton();
	JTextField answer = new JTextField(20);
	JTextField enter = new JTextField (20);
	public static void main(String[] args) {
		// TODO Auto-generated method 
		BinaryStuff stuff = new BinaryStuff();
		stuff.Binary();
	    }
	void Binary(){
		jframe.add(jpanel);
		jframe.setVisible(true);
		jpanel.add(enter);
		jpanel.add(button);
		jpanel.add(answer);
		button.setText("Give me Binary or Give me Death");
		button.addActionListener(this);
		jframe.pack();
	}
	int convert(String binary) {
		if(binary.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		 if(!Pattern.matches("\\A[01]+\\Z", binary)) {
			 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
				return 0;
		 }
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			//question.setText("");
			return 0;
		}
	}
 String convertLetter(String binary) {
   	 int asciiValue = Integer.parseInt(binary);
   	 char theLetter = (char) asciiValue;
   	 return "" + theLetter;
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String binaryNum = enter.getText();
	System.out.println("hello");
    String num = convert(binaryNum)+ "";
    System.out.println("goodbye");
    String ans = convertLetter(num);
    System.out.println("hello"); 
    answer.setText(ans);
}
}
