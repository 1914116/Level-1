package Graphics;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin2 implements ActionListener {
JFrame frame; 
JPanel panel;
JButton button;
JTextField textfield = new JTextField();
JTextField text = new JTextField();

	public PigLatin2() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		frame.add(panel);
		panel.add(textfield);
		panel.add(button);
		panel.add(text);
		frame.setVisible(true);
		frame.setSize(500, 500);
		button.setText("Translate");
	textfield.setPreferredSize(new Dimension(150,25));
	text.setPreferredSize(new Dimension(150,25));
	button.addActionListener(this);
	}
public static void main(String[] args) {
	PigLatin2 A = new PigLatin2();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	PigLatinTranslator PLT = new PigLatinTranslator();
	String t = PLT.translate(textfield.getText());
	text.setText(t);
}
}
