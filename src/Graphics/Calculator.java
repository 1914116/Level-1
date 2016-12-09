package Graphics;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame calculator = new JFrame();
	JPanel calc = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton div = new JButton();
	JButton mul = new JButton();
	JTextField x = new JTextField();
	JTextField y = new JTextField();
	JLabel ans = new JLabel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Calculator c = new Calculator();
	 c.showCalculator();
	}
void showCalculator(){
	calculator.add(calc);
	calc.add(x);
	calc.add(add);
	calc.add(sub);
	calc.add(div);
	calc.add(mul);
	calc.add(y);
	calc.add(ans);
	add.setText("Addition");
	sub.setText("Subtract");
	mul.setText("Multiply");
	div.setText("divide");
	calculator.setVisible(true);
	calculator.setSize(500, 150);
	x.setPreferredSize(new Dimension(50,25));
	y.setPreferredSize(new Dimension(50,25));
	add.addActionListener(this);
	sub.addActionListener(this);
	div.addActionListener(this);
	mul.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==add){
		String a = x.getText();
		String b = y.getText();
		int c =Integer.parseInt(b);
		int d = Integer.parseInt(a);
		int f = c + d;
	}
	else if(e.getSource()==sub){
		
	}
	else if(e.getSource()==div){
	
}
	else if(e.getSource()==mul){
	
}
}
}

